
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author USER
 */
class PaymentManager {
    public void processPayment(Scanner scanner, double totalAmount) {
        System.out.println("Processing Payment");
        System.out.print("Enter cash amount: $");
        double cashAmount = scanner.nextDouble();

        double balance = cashAmount - totalAmount;
        System.out.println("Balance: $" + balance);
    }
}

