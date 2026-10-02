package Developer.HibernateProductDemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Developer.HibernateProductDemo.Entity.ProductDetails;
import Developer.HibernateProductDemo.Repository.ProductRepository;

@Service 
public class ProductServiceImp implements ProductService {

    
    private ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDetails saveProduct(ProductDetails productDetails) {
        return productRepository.save(productDetails);
    }

    @Override
    public List<ProductDetails> fetchProductList() {
        return (List<ProductDetails>) productRepository.findAll();
    }

    @Override
    public ProductDetails findByNameProduct(String productName) {
       return this.productRepository.findByProductName(productName).orElseThrow(()->new RuntimeException("No user found this name:"));
    }

    @Override 
    public ProductDetails updateProduct(String productName, ProductDetails productDetails){

         ProductDetails product = productRepository.findByProductName(productName).orElseThrow(()->new RuntimeException("No user found this name:"));
         product.setProductName(productDetails.getProductName());
         product.setProdQuantity(productDetails.getProdQuantity());
         product.setProductPrice(productDetails.getProductPrice());
         return productRepository.save(product);
    }
    @Override 
    public ProductDetails deleteProduct(Long productId){
        ProductDetails delProduct  = productRepository.findById(productId).orElseThrow(()->new RuntimeException("No user found this id:"));
       productRepository.delete(delProduct);
       return delProduct;
    }

}
