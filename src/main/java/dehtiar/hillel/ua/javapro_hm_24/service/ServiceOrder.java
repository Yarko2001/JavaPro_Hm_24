package dehtiar.hillel.ua.javapro_hm_24.service;

import dehtiar.hillel.ua.javapro_hm_24.model.Order;
import dehtiar.hillel.ua.javapro_hm_24.model.Orders;
import dehtiar.hillel.ua.javapro_hm_24.repository.OrderRepository;
import java.time.LocalDateTime;
import lombok.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * {@link ServiceOrder} is a class for making and getting orders.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Value
@Service
@Scope("prototype")
public class ServiceOrder {

  OrderRepository orderRepository;
  ServiceCart serviceCart;


  public Order getOrder(Long id) {
    return orderRepository.getOrder(id);
  }

  public Orders getAllOrders() {
    return orderRepository.getOrders();
  }

  public void addOrder(Long id, ServiceCart serviceCart) {
    orderRepository.addOrder(id, new Order(id, LocalDateTime.now(), serviceCart.getTotalCost(), serviceCart.getProducts()));
  }

}
