package dehtiar.hillel.ua.javapro_hm_24.model;

import java.util.HashMap;
import java.util.Map;
import lombok.Value;
import org.springframework.stereotype.Component;

/**
 * {@link Orders} is a store class with list of orders.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Value
@Component
public class Orders {

  Map<Long, Order> listOfOrders = new HashMap<>();


  public Order getOrder(Long id) {
    return listOfOrders.get(id);
  }

  public void addOrder(Long id, Order order) {
    listOfOrders.put(id, order);
  }

}
