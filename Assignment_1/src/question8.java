/*Question 8:
Area of a triangle can be calculated if lengths of its three sides is known
by using the Heron’s formula which says that Square root of
(s(s−a)(s−b)(s−c)) where s is half of the perimeter of the triangle that
can be calculated by adding length of all the three sides and then
dividing it by 2.(for further information suggested resource is
https://www.cuemath.com/measurement/area -of-triangle/ ).
The image given on right hand side of this question is
available at the given URL.*/

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of first side: ");
        double a = sc.nextDouble();
        System.out.print("Length of second side: ");
        double b = sc.nextDouble();
        System.out.print("Length of third side: ");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle : " + area);
        sc.close();
    }}
