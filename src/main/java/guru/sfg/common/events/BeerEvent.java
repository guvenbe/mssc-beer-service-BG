package guru.sfg.common.events;

import guru.springframework.msscbeerservicebg.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 6141155796579957167L;
    private BeerDto beerDto;
}
