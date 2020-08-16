package guru.springframework.msscbeerservicebg.services;

import guru.springframework.msscbeerservicebg.web.model.BeerDto;
import guru.springframework.msscbeerservicebg.web.model.BeerPagedList;
import guru.springframework.msscbeerservicebg.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
   BeerDto getBeerById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest of, Boolean showInventoryOnHand);

    BeerDto getBeerByUpc(String upc);
}

