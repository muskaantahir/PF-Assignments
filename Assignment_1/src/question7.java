/*Question 7:
An even number is an integer of the form n=2k, where k is an integer. The even numbers
are therefore ..., -4, -2, 0, 2, 4, 6, 8, 10, …(REF:
https://mathworld.wolfram.com/EvenNumber.html). While An odd number is an integer of the
form n=2k+1, where k is an integer. The odd numbers are therefore ..., -3, -1, 1, 3, 5,
7, … (REF:
https://mathworld.wolfram.com/OddNumber.html). so for the purpose of writing a computer
program we can deduce that if, upon dividing a real integer number by2 leaves one as
remainder then that number will be called an odd number otherwise it is an even number.
Write a program that takes input an integer number and prints “EVEN” if it is an even
number and if it is an odd number than it prints “ODD”.*/

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
        sc.close();
        }}