package divide;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfK {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int selection = scanner.nextInt();
        int[] number = new int[inputCount];

        for (int i = 0; i < inputCount; i++) {
            number[i] = scanner.nextInt();
        }

        Arrays.sort(number);
        System.out.println(number[selection - 1]);
    }
}
