package home.work.l2;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    public String getAllProducts(Model model){
        model.addAttribute("frontProducts", productService.getAllProducts());
        return "all_products";
    }

    @GetMapping("/add")
    public String addProduct(){
        return "add_products";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product){
        productService.addProduct(product);
        return "redirect:/products/add";
    }
}
