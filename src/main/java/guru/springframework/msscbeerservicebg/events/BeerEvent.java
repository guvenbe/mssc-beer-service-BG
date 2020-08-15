package guru.springframework.msscbeerservicebg.events;

import guru.springframework.msscbeerservicebg.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 6141155796579957167L;
    private final BeerDto beerDto;
}
