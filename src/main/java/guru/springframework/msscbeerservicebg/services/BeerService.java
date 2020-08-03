package guru.springframework.msscbeerservicebg.services;

import guru.springframework.msscbeerservicebg.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
   BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
