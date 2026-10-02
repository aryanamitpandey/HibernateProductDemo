package Developer.HibernateProductDemo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Developer.HibernateProductDemo.Entity.ProductDetails;


public interface ProductRepository extends JpaRepository<ProductDetails, Long> {

    Optional<ProductDetails> findByProductName(String productName);    

    

    

  
}