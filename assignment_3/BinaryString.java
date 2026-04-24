package assignment_3;

public class BinaryString {

    public static String toBinaryString(int num) {
        if (num == 0) {
            return "0";
        }

        char[] temp = new char[32];
        int index = 0;

        while (num > 0) {
            int remainder = num % 2;
            temp[index] = (char) (remainder + '0');
            num = num / 2;
            index++;
        }

        // Reverse into final string
        String result = "";
        for (int i = index - 1; i >= 0; i--) {
            result = result + temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(toBinaryString(26));
    }
}