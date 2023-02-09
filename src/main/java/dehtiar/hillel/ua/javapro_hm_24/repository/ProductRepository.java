package dehtiar.hillel.ua.javapro_hm_24.repository;

import dehtiar.hillel.ua.javapro_hm_24.model.Product;
import dehtiar.hillel.ua.javapro_hm_24.model.Products;
import lombok.Value;
import org.springframework.stereotype.Repository;

/**
 * {@link ProductRepository} is a class for getting products from the {@link Products}.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Value
@Repository
public class ProductRepository {

  Products products;


  public Product getProduct(Long id) {
    return products.getProduct(id);
  }

}
