package Developer.HibernateProductDemo.Service;

import java.util.List;

import Developer.HibernateProductDemo.Entity.ProductDetails;

public interface ProductService {

ProductDetails saveProduct(ProductDetails productDetails);

List<ProductDetails> fetchProductList();

public ProductDetails findByNameProduct(String productName);

public ProductDetails updateProduct(String productName, ProductDetails productDetails);

public ProductDetails deleteProduct(Long productId);
  
    
    
}
