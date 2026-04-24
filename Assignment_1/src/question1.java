/* Question 1:
Write a program that prints the percentage marks of high school graduates by taking
input of sum of their obtained marks and Maximum marks.  */

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double obtainedMarks = scannerObj.nextDouble();

        System.out.print("Enter maximum marks: ");
        double maximumMarks = scannerObj.nextDouble();

        double percent = (obtainedMarks / maximumMarks) * 100;

        // Display result
        System.out.println("Percentage Marks = " + percent + "%");

        scannerObj.close();

    }
}
