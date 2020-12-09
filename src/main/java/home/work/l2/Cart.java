package home.work.l2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Cart {
    List<Product> shoppingList = new ArrayList<>();

    @Autowired
    ProductRepository productRepository;

    public void addInCart(Long prodId){
        shoppingList.add(productRepository.getProductOnId(prodId));
    }

    public void pullOutCart(Long prodId){
        for (Product p : shoppingList) {
            if(p.getId() == prodId){
                shoppingList.remove(p);
            }
        }
    }

    public List<Product> showCart(){
        return shoppingList;
    }

    public List<Product> showStock(){
        return productRepository.getProductList();
    }
}
