package guru.springframework.msscbeerservicebg.services.inventory;

import java.util.UUID;

public interface BeerInventoryService {

    Integer getOnHandInventory(UUID beerId);
}
