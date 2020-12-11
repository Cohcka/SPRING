package home.work.l2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Scope (scopeName = "singleton")
public class ProductRepository {
    List<Product> productList;

    @PostConstruct
    private void init(){
        productList = new ArrayList<>();
        productList.add(new Product(1l,"Pineapple", 70));
        productList.add(new Product(2l,"Milk", 10));
        productList.add(new Product(3l,"Microphone", 330));
        productList.add(new Product(4l,"Honey", 220));
        productList.add(new Product(5l,"Water", 1));
    }

    public List<Product> getProductList() {
        return Collections.unmodifiableList(productList);
    }

    public void addProduct(Product product){
        productList.add(product);
    }
}


