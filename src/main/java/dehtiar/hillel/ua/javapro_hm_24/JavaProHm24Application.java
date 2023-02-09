package dehtiar.hillel.ua.javapro_hm_24;

import dehtiar.hillel.ua.javapro_hm_24.service.ServiceCart;
import dehtiar.hillel.ua.javapro_hm_24.service.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaProHm24Application {

  @Autowired
  private ServiceCart cartService1;

  @Autowired
  private ServiceCart cartService2;

  @Autowired
  private ServiceOrder orderService;

  public static void main(String[] args) {
    SpringApplication.run(JavaProHm24Application.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void inited() {

    cartService1.addProduct(1L);
    cartService1.addProduct(5L);
    cartService1.addProduct(3L);
    System.out.println("Products in the cart1 after adding : " + cartService1.getProducts());

    cartService1.removeProduct(1L);
    System.out.println("Products in the cart1 after removing : " + cartService1.getProducts());

    cartService2.addProduct(1L);
    cartService2.addProduct(2L);
    cartService2.addProduct(3L);
    System.out.println("Products in the cart1 after adding : " + cartService2.getProducts());

    cartService2.removeProduct(1L);
    System.out.println("Products in the cart1 after removing : " + cartService2.getProducts());

    orderService.addOrder(0L,cartService1);
    orderService.addOrder(1L,cartService2);
    System.out.println("All orders : " + orderService.getAllOrders());

  }

}
