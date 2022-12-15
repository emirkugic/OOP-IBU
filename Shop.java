package week10;
import java.util.Scanner;

public class Shop {
    private Storehouse store; 
    private Scanner reader;

    public Shop (Storehouse store, Scanner reader) {
        this.store = store; 
        this.reader = reader;
    }

    public void manage(String customer) { 
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop" + customer);
        System.out.println("below is our sale offer:");

        // Print all the products in the storehouse
        for (String product : store.products()) { 
            System.out.println(product);
        }

        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine(); 

            // If the user just presses enter, break out of the loop
            if (product.isEmpty()) {
                break;
            }

            // If the product is in stock, add it to the shopping basket and decrease its stock in the storehouse
            if (store.stock(product) > 0) {
                basket.add(product, store.price(product));
                store.take(product);
            }
        }

        // Print the user's purchases and the total price of the basket
        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }
}
