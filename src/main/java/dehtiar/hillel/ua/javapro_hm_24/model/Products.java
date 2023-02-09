package dehtiar.hillel.ua.javapro_hm_24.model;

import java.util.Map;
import lombok.Value;

/**
 * {@link Products} is a store class with list of products.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Value
public class Products {

  Map<Long, Product> listOfProducts;

  public Product getProduct(Long id) {
    return listOfProducts.get(id);
  }
}
