package home.work.l2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean("cart", Cart.class);
        context.close();

        scanner = new Scanner(System.in);

        while(true) {
            String[] cmd = scanner.nextLine().split(" ", 2);
            switch (cmd[0]) {
                case ("add"):
                    cart.addInCart(Long.parseLong(cmd[1]));
                    break;
                case ("remove"):
                    cart.pullOutCart(Long.parseLong(cmd[1]));
                    break;
                case("show"):
                    if (cmd[1].equals("cart")){
                        List<Product> tmpList = cart.showCart();
                        for (Product p:tmpList) {
                            System.out.println(p.toString());
                        }
                        break;
                    } else if (cmd[1].equals("stock")) {
                        List<Product> tmpList = cart.showStock();
                        for (Product p : tmpList) {
                            System.out.println(p.toString());
                        }
                        break;
                    }
                default:
                    System.out.println("incorrect command");
            }
        }
    }
}
