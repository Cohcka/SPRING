package home.work.l2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(){
        this.productRepository = productRepository;
    }

    private List<Product> productList = productRepository.getProductList();

    public void addProduct(Product product){
        productRepository.addProduct(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.getProductList();
    }
}
