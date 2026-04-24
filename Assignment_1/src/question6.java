/*Question 6:
A quadrilateral with at least one pair of parallel sides
is called a trapezoid or trapezium.
The area K of a trapezoid is given by K = h * (a + b)/2,
where a and b are the lengths of the parallel sides, h
is the height (the perpendicular distance between
these sides). Write a program that takes input lengths
of two parallel sides and the perpendicular distance
between these two parallel lines, and prints the area
of this trapezoid. (Image Reference:
https://en.wikipedia.org/wiki/Trapezoid Trapezoid
special cases. The orange figures also qualify as parallelograms.) */
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of one parallel side: ");
        double a = sc.nextDouble();
        System.out.print("Enter length of another parallel side: ");
        double b = sc.nextDouble();
        System.out.print("Enter height or distance between both parallel sides: ");
        double h = sc.nextDouble();
        double k = h * (a + b)/2;
        System.out.println("Area: " + k);
        sc.close();
    }
}

