package dehtiar.hillel.ua.javapro_hm_24.configuration;

import dehtiar.hillel.ua.javapro_hm_24.model.Product;
import dehtiar.hillel.ua.javapro_hm_24.model.Products;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link StoreConfiguration} is a class for creation and configuration beans{@link Products}.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Configuration
public class StoreConfiguration {

  @Bean
  public Products products() {
    Map<Long, Product> products = new HashMap<>();
    products.put(0L, new Product(0, "bread", 18.50));
    products.put(1L, new Product(1, "buckwheat", 80.99));
    products.put(2L, new Product(2, "chicken", 100.0));
    products.put(3L, new Product(3, "banana", 40.0));
    products.put(4L, new Product(4, "cucumber", 40.0));
    products.put(5L, new Product(5, "tomato", 50.0));

    return new Products(products);
  }

}
