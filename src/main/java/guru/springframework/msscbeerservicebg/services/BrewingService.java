package guru.springframework.msscbeerservicebg.services;

import guru.springframework.msscbeerservicebg.config.JmsConfig;
import guru.springframework.msscbeerservicebg.domain.Beer;
import guru.springframework.msscbeerservicebg.events.BeerEvent;
import guru.springframework.msscbeerservicebg.repositories.BeerRepository;
import guru.springframework.msscbeerservicebg.services.inventory.BeerInventoryService;
import guru.springframework.msscbeerservicebg.web.mappers.BeerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BrewingService {
    private final BeerRepository beerRepository;
    private final BeerInventoryService beerInventoryService;
    private final JmsTemplate jmsTemplate;
    private BeerMapper beerMapper;

    @Scheduled(fixedRate = 5000) //every 5 seconds
    protected void checkForLowInventory(){
        List<Beer> beers =beerRepository.findAll();
        beers.forEach(beer -> {
            //REST call to inventory service for each beer to get onventory on hand
            Integer invQOH = beerInventoryService.getOnHandInventory(beer.getId());
            log.debug("Min OnHand is: " + beer.getMinOnHand());
            log.debug("Inventory is: " + invQOH);

            if(beer.getMinOnHand() >= invQOH ){
                jmsTemplate.convertAndSend(JmsConfig.BREWING_REQUEST_QUEUE, new BeerEvent(beerMapper.beerToBeerDto(beer)));
            }
        });
    }
}
