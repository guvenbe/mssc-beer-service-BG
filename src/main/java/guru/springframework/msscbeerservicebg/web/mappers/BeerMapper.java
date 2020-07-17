package guru.springframework.msscbeerservicebg.web.mappers;

import guru.springframework.msscbeerservicebg.domain.Beer;
import guru.springframework.msscbeerservicebg.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
