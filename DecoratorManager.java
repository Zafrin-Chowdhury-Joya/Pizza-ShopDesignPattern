/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author USER
 */
class DecoratorManager {
    public void setPizzaDecorator(PizzaDecorator pizzaDecorator, Pizza pizza) {
        pizzaDecorator.decorate(pizza);
        pizza.setPrice(pizza.getPrice() + pizzaDecorator.getExtraAmount());
    }
}

