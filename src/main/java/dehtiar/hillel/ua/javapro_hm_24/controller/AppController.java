package dehtiar.hillel.ua.javapro_hm_24.controller;

import dehtiar.hillel.ua.javapro_hm_24.model.Order;
import dehtiar.hillel.ua.javapro_hm_24.model.Orders;
import dehtiar.hillel.ua.javapro_hm_24.service.ServiceOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link AppController} is a class for restful web service operation.
 * The main path is "/app/api" with port "8081".
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/app/api")
public class AppController {

  private final ServiceOrder orderService;

  @GetMapping(value = "/order/{id}")
  public Order getOrder(@PathVariable Long id) {
    return orderService.getOrder(id);
  }

  @GetMapping(value = "/orders")
  public Orders getAllOrders() {
    return orderService.getAllOrders();
  }

}
