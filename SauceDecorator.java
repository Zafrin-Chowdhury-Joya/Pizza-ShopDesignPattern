
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class SauceDecorator implements PizzaDecorator {
    private static final double EXTRA_AMOUNT = 1.00; // Example extra amount for sauce

    @Override
    public double getExtraAmount() {
        return EXTRA_AMOUNT;
    }

    @Override
    public void decorate(Pizza pizza) {
        System.out.println("Adding extra sauce to the pizza!");
        pizza.setName(pizza.getName() + " (Sauce Decorated)");
    }
}