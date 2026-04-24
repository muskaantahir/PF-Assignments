/*Question 4:
Write a program to calculate and print the original selling price if the discounted
selling price and discount percentage is entered by the user.*/

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Discounted selling price: ");
        double discountedSellingPrice = scObj.nextDouble();

        System.out.print("discount percentage: ");
        double discountPercent = scObj.nextDouble();

        double originalSellingPrice = discountedSellingPrice/(1 - discountPercent/100);

        System.out.println("Original Selling Price: " + originalSellingPrice);

        scObj.close();
    }
}
