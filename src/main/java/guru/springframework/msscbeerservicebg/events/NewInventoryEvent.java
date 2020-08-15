package guru.springframework.msscbeerservicebg.events;

import guru.springframework.msscbeerservicebg.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent{
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
