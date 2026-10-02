package Developer.HibernateProductDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@Table(name = "product_tb")
public class ProductDetails {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private Double productPrice;
    private Integer prodQuantity;
    
}
