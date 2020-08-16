package guru.sfg.common.events;

import guru.springframework.msscbeerservicebg.web.model.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent  {
    BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
