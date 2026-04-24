/*Question 3:
Discounted Selling price is to be calculated if original selling price and discount
percentage is given. Write a program to calculate and print discounted selling price of
the user given two inputs (1) original selling price and (2) discounted selling price. */

import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("original selling price: ");
        double originalPrice = scObj.nextDouble();

        System.out.print("discount percentage: ");
        double discountPercent = scObj.nextDouble();

        double discountAmount = (discountPercent / 100) * originalPrice;
        double discountedPrice = originalPrice - discountAmount;

        System.out.println("Discounted Selling Price: " + discountedPrice);

        scObj.close();
    }
}
