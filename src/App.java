import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domian.Product;
import services.CoinDespenser;
import services.Display;
import services.Holder;
import services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product product= new Product(
            1,"lays",132.55,13
        );
        Product product1= new Product(
            2,"alpenGold",100.09,11
        );
        Product product2= new Product(
            3,"7up",143.55,9
        );
        Product product3= new Product(
            4,"m&m",134.55,10
        );
    
        System.out.println(product);
        List<Product> foo = new ArrayList<>();
        foo.add(product);
        foo.add(product1);
        foo.add(product2);
        foo.add(product3);
        System.out.println(foo);
        Holder holder=new Holder();
        Display display = new Display();
        CoinDespenser coinDespenser= new CoinDespenser();
        VendingMachine machine=new VendingMachine(null, null, null, foo);
        for (Product item : machine.getProducts()) {
            System.out.println(item);
        }

        
    }
}
