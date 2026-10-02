package Developer.HibernateProductDemo.Controller;


import Developer.HibernateProductDemo.Entity.ProductDetails;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Developer.HibernateProductDemo.Service.ProductService;

@RestController 
@RequestMapping("/api")
public class ProductController {

    
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ProductDetails saveProduct(@RequestBody ProductDetails productDetails){
        return productService.saveProduct(productDetails);
    }
    @GetMapping("/all-products")
    public List<ProductDetails> fetchProductList(){
        return productService.fetchProductList();
    }

    @GetMapping("/{productName}")
    public ProductDetails findByName(@RequestParam String productName){
        return productService.findByNameProduct(productName);
    }
    @PutMapping("/update")
    public ProductDetails updateProduct(@RequestParam String productName, @RequestBody ProductDetails productDetails){
        return productService.updateProduct(productName, productDetails);
    }
    @DeleteMapping("/delete")
    public ProductDetails deleteProduct(@RequestParam Long productId){
        return productService.deleteProduct(productId);
    }


    
}
