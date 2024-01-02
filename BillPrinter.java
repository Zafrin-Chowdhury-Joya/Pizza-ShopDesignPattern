import java.util.Vector;

class BillPrinter {
    public void printBill(Vector<Pizza> cart, double totalAmount) {
        System.out.println("Printing Bill");
        System.out.println("------------------------------");
        System.out.println("Item \tQty \tPrice");
        for (Pizza pizza : cart) {
            System.out.println(pizza.getName() + "\t" + pizza.getQuantity() + "\t" + pizza.getRecalculatedPrice());
        }

        // Display extra amount for each decorated pizza
        for (Pizza pizza : cart) {
            if (pizza.getName().contains(" (Cheese Decorated)")) {
                System.out.println("Extra Cheese: $" + new CheeseDecorator().getExtraAmount());
            } else if (pizza.getName().contains(" (Sauce Decorated)")) {
                System.out.println("Extra Sauce: $" + new SauceDecorator().getExtraAmount());
            }
        }

        System.out.println("------------------------------");
        System.out.println("SubTotal: $" + totalAmount);
        System.out.println("------------------------------");
        System.out.println("Thanks For Your Business...!");
        System.out.println("------------------------------");
    }
}
