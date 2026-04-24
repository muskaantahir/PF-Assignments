/*Question 2:
Write a program that takes input of radius of circle
and prints its circumference and area. */


import java.util.Scanner;


public class question2 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scannerObj.nextDouble();

        double circum = Math.PI * 2 * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference of circle: " + circum);
        System.out.println("Area of circle: " + area);

        scannerObj.close();
    }
}

