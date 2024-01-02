
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class CheeseDecorator implements PizzaDecorator {
    private static final double EXTRA_AMOUNT = 1.50; // Example extra amount for cheese

    @Override
    public double getExtraAmount() {
        return EXTRA_AMOUNT;
    }

    @Override
    public void decorate(Pizza pizza) {
        System.out.println("Adding extra cheese to the pizza!");
        pizza.setName(pizza.getName() + " (Cheese Decorated)");
    }
}