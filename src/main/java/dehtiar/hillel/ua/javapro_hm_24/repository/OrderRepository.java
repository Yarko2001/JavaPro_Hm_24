package dehtiar.hillel.ua.javapro_hm_24.repository;

import dehtiar.hillel.ua.javapro_hm_24.model.Order;
import dehtiar.hillel.ua.javapro_hm_24.model.Orders;
import lombok.Value;
import org.springframework.stereotype.Repository;

/**
 * {@link OrderRepository} is a class for getting orders from the {@link Orders}.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Value
@Repository
public class OrderRepository {

  Orders orders;

  public Order getOrder(Long id) {
    return orders.getOrder(id);
  }

  public void addOrder(Long id, Order order) {
    orders.addOrder(id, order);
  }

}
