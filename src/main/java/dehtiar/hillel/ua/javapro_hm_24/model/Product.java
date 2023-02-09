package dehtiar.hillel.ua.javapro_hm_24.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@link Product} is a product data class.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Integer id;
  private String name;
  private Double cost;

}
