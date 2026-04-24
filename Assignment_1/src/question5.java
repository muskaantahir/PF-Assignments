/*Question 5:
Watts is the measure of power consumption of electrical appliances. Which can be
calculated by using voltmeter and ammeter to read the voltage and ampere. Write a
program that prints the Watts against the user given volt and ampere reading. REF:
https://www.webstaurantstore.com/guide/600/how-to-calculate-amps-volts-and- watts.html */

import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Volts in volts: ");
        double volts = sc.nextDouble();
        System.out.print("Enter Ampere in amperes: ");
        double ampere = sc.nextDouble();
        System.out.println("Watts: " + (volts * ampere) + " W");
        sc.close();
    }
}