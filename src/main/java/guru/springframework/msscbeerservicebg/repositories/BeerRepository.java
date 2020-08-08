package guru.springframework.msscbeerservicebg.repositories;

import guru.springframework.msscbeerservicebg.domain.Beer;
import guru.springframework.msscbeerservicebg.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
   Page<Beer> findAllByBeerNameAndAndBeerStyle(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);
   Page<Beer> findAllByBeerName(String beerName, PageRequest pageRequest);
   Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, PageRequest pageRequest);
}
