package bruteforce;

import java.util.Scanner;

public class DecompositionSum {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit, answer, temp;
        boolean hasConstructor = false;

        for (int i = 1; i < number; i++) {
            digit = String.valueOf(i).length();
            answer = i;
            temp = 1;

            for (int j = 0; j < digit; j++) {
                answer += (i / temp) % 10;
                temp *= 10;
            }

            if (answer == number) {
                System.out.println(i);
                hasConstructor = true;
                break;
            }
        }

        if (!hasConstructor) {
            System.out.println(0);
        }
    }
}
