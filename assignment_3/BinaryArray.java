public class BinaryArray {

    public static int[] toBinaryArray(int num) {
        if (num == 0) {
            return new int[]{0};
        }

        int[] temp = new int[32];
        int index = 0;

        while (num > 0) {
            temp[index] = num % 2;
            num = num / 2;
            index++;
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[index - 1 - i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] binary = toBinaryArray(27);

        for (int bit : binary) {
            System.out.print(bit);
        }
    }
}
