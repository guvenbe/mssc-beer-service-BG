package guru.springframework.msscbeerservicebg.events;

import guru.springframework.msscbeerservicebg.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent {
    BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
