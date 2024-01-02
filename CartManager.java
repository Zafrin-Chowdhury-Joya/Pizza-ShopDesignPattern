
import java.util.Vector;

class CartManager {
    private Vector<Pizza> cart = new Vector<>();
    private double totalAmount = 0;

    public void addPizzaToCart(Pizza pizza) {
        cart.add(pizza);
        totalAmount += pizza.getTotalPrice();
    }

    public Vector<Pizza> getCart() {
        return cart;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void displayCart() {
        System.out.println("Cart:");
        System.out.println("Item \tQty \tPrice");
        for (Pizza pizza : cart) {
            System.out.println(pizza.getName() + "\t" + pizza.getQuantity() + "\t" + pizza.getTotalPrice());
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
