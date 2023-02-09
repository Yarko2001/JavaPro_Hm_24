package dehtiar.hillel.ua.javapro_hm_24.model;

import java.time.LocalDateTime;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@link Order} is an order data class.
 *
 * @author Yaroslav Dehtiar on 09.02.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  private Long id;
  private LocalDateTime localDateTime;
  private Double cost;
  private Map<Long, Product> products;


}
