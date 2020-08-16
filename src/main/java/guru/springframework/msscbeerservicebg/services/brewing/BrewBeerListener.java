package guru.springframework.msscbeerservicebg.services.brewing;

import guru.sfg.common.events.BrewBeerEvent;
import guru.sfg.common.events.NewInventoryEvent;
import guru.springframework.msscbeerservicebg.config.JmsConfig;
import guru.springframework.msscbeerservicebg.domain.Beer;
import guru.springframework.msscbeerservicebg.repositories.BeerRepository;
import guru.springframework.msscbeerservicebg.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Slf4j
public class BrewBeerListener {
    private final BeerRepository beerRepository;
    private final JmsTemplate jmsTemplate;

    @Transactional
    @JmsListener(destination = JmsConfig.BREWING_REQUEST_QUEUE)
    public void listen(BrewBeerEvent event){

        BeerDto beerDto = event.getBeerDto();

        Beer beer = beerRepository.getOne(beerDto.getId());
        beerDto.setQuantityOnHand(beer.getQuantityToBrew());

        NewInventoryEvent newInventoryEvent = new NewInventoryEvent(beerDto);
        log.info("Brewed beer" + beer.getBeerName() + " " + beer.getMinOnHand() + " :QOH:" + beerDto.getQuantityOnHand());
        jmsTemplate.convertAndSend(JmsConfig.NEW_INVENTORY_QUEUE, newInventoryEvent);
    }
}
