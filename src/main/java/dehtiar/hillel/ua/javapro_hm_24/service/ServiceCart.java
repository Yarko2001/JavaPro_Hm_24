package dehtiar.hillel.ua.javapro_hm_24.service;

import dehtiar.hillel.ua.javapro_hm_24.model.Product;
import dehtiar.hillel.ua.javapro_hm_24.repository.ProductRepository;
import java.util.HashMap;
import java.util.Map;
import lombok.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * {@link ServiceCart} is a store class, where you can add and remove the products,
 * and to found out the total cost of the products.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Value
@Service
@Scope("prototype")
public class ServiceCart {

  ProductRepository productRepository;
  Map<Long, Product> products = new HashMap<>();

  public void addProduct(Long id) {
    products.put(id, productRepository.getProduct(id));
  }

  public void removeProduct(Long id) {
    products.remove(id, productRepository.getProduct(id));
  }

  public Double getTotalCost() {
    return products.values().stream()
        .map(Product::getCost)
        .reduce(0.0, Double::sum);
  }

}
