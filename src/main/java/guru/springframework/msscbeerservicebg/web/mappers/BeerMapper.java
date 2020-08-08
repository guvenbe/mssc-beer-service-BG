package guru.springframework.msscbeerservicebg.web.mappers;

import guru.springframework.msscbeerservicebg.domain.Beer;
import guru.springframework.msscbeerservicebg.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
