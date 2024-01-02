import java.util.Scanner;
public class PizzaPointOfSale {
    private static PizzaPointOfSale instance;
    private final CartManager cartManager = new CartManager();
    private final PaymentManager paymentManager = new PaymentManager();
    private final BillPrinter billPrinter = new BillPrinter();

    private PizzaPointOfSale() {
        // private constructor to prevent instantiation
    }

    public static PizzaPointOfSale getInstance() {
        if (instance == null) {
            instance = new PizzaPointOfSale();
        }
        return instance;
    }

    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Pizza 1 - $2.00");
        System.out.println("2. Pizza 2 - $3.00");
        System.out.println("3. Pizza 3 - $4.00");
        System.out.println("4. Pizza 4 - $3.50");
        System.out.println("5. Pizza 5 - $2.70");
        System.out.println("6. Pizza 6 - $3.00");
        System.out.println("7. Pizza 7 - $3.50");
        System.out.println("8. Pizza 8 - $5.00");
        System.out.println("9. View Cart");
        System.out.println("10. Process Payment");
        System.out.println("11. Print Bill");
        System.out.println("12. Exit");
        System.out.println("13. Add Cheese to All Pizzas");
        System.out.println("14. Add sauce to All Pizzas");
        System.out.print("Enter your choice: ");
    }

public void setPizzaDecorator(PizzaDecorator pizzaDecorator, Pizza pizza) {
    pizzaDecorator.decorate(pizza);
    // Instead of modifying the price, add the extra amount to the total price
    double newTotalPrice = pizza.getTotalPrice() + pizzaDecorator.getExtraAmount();
    pizza.setTotalPrice(newTotalPrice);
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaPointOfSale pizzaPOS = PizzaPointOfSale.getInstance();

        while (true) {
            pizzaPOS.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    int quantity1 = scanner.nextInt();
                    Pizza pizza1 = new Pizza("Pizza 1", 2.00, quantity1);
                    pizzaPOS.cartManager.addPizzaToCart(pizza1);
                    break;

                case 2:
                    System.out.print("Enter quantity: ");
                    int quantity2 = scanner.nextInt();
                    Pizza pizza2 = new Pizza("Pizza 2", 3.00, quantity2);
                    pizzaPOS.cartManager.addPizzaToCart(pizza2);
                    break;
               case 3:
                    System.out.print("Enter quantity: ");
                    int quantity3 = scanner.nextInt();
                    Pizza pizza3 = new Pizza("Pizza 3", 4.00, quantity3);
                    pizzaPOS.cartManager.addPizzaToCart(pizza3);
                    break;
               case 4:
                    System.out.print("Enter quantity: ");
                    int quantity4 = scanner.nextInt();
                    Pizza pizza4 = new Pizza("Pizza 4", 3.50, quantity4);
                    pizzaPOS.cartManager.addPizzaToCart(pizza4);
                    break;
               case 5:
                    System.out.print("Enter quantity: ");
                    int quantity5 = scanner.nextInt();
                    Pizza pizza5 = new Pizza("Pizza 5", 2.70, quantity5);
                    pizzaPOS.cartManager.addPizzaToCart(pizza5);
                    break;
               case 6:
                    System.out.print("Enter quantity: ");
                    int quantity6 = scanner.nextInt();
                    Pizza pizza6 = new Pizza("Pizza 6", 3.00, quantity6);
                    pizzaPOS.cartManager.addPizzaToCart(pizza6);
                    break;
                case 7:
                    System.out.print("Enter quantity: ");
                    int quantity7 = scanner.nextInt();
                    Pizza pizza7 = new Pizza("Pizza 7", 3.00, quantity7);
                    pizzaPOS.cartManager.addPizzaToCart(pizza7);
                    break;
                case 8:
                    System.out.print("Enter quantity: ");
                    int quantity8 = scanner.nextInt();
                    Pizza pizza8 = new Pizza("Pizza 5", 3.00, quantity8);
                    pizzaPOS.cartManager.addPizzaToCart(pizza8);
                    break;                   
                case 9:
                    pizzaPOS.cartManager.displayCart();
                    break;

                case 10:
                    pizzaPOS.paymentManager.processPayment(scanner, pizzaPOS.cartManager.getTotalAmount());
                    break;

                case 11:
                    pizzaPOS.billPrinter.printBill(pizzaPOS.cartManager.getCart(), pizzaPOS.cartManager.getTotalAmount());
                    break;

                case 12:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;

                case 13:
                    if (!pizzaPOS.cartManager.getCart().isEmpty()) {
                        PizzaDecorator cheeseDecorator = new CheeseDecorator();
                        for (Pizza pizza : pizzaPOS.cartManager.getCart()) {
                            pizzaPOS.setPizzaDecorator(cheeseDecorator, pizza);
                        }
                        System.out.println("Added extra cheese to all pizzas in the cart.");
                    } else {
                        System.out.println("Cart is empty. Add pizzas before applying the decorator.");
                    }
                    break;
                    
                 case 14:
                    if (!pizzaPOS.cartManager.getCart().isEmpty()) {
                        PizzaDecorator sauceDecorator = new SauceDecorator();
                        for (Pizza pizza : pizzaPOS.cartManager.getCart()) {
                            pizzaPOS.setPizzaDecorator(sauceDecorator, pizza);
                        }
                        System.out.println("Added extra sauce to all pizzas in the cart.");
                    } else {
                        System.out.println("Cart is empty. Add pizzas before applying the decorator.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}