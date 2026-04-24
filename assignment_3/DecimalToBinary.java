import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();

        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        int[] binary = new int[32]; 
        int index = 0;

        while (num > 0) {
            binary[index] = num % 2;
            num = num / 2;
            index++;
        }

        System.out.print("Binary: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
