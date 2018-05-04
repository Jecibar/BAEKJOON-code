package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class SeventhDwarf {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int[] inputDwarfs = new int[9];
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < 9; i++) {
            inputDwarfs[i] = scanner.nextInt();
            sum += inputDwarfs[i];
        }

        Arrays.sort(inputDwarfs);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (inputDwarfs[i] + inputDwarfs[j] == (sum - 100)) {
                    inputDwarfs[i] = inputDwarfs[j] = 0;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                for (int j = 0; j < 9; j++) {
                    if (inputDwarfs[j] == 0) {
                        continue;
                    }

                    System.out.println(inputDwarfs[j]);
                }

                break;
            }
        }
    }
}
