package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class SeventhDwarf {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int[] inputDwarfs = new int[9];
        int[] resultDwarfs = new int[7];
        int sum, index = 0;

        for (int i = 0; i < 9; i++) {
            inputDwarfs[i] = scanner.nextInt();
        }

        Arrays.sort(inputDwarfs);

        while (true) {
            sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += inputDwarfs[i + index];
                resultDwarfs[i] = inputDwarfs[i + index];
            }

            if (sum == 100) {
                printAll(resultDwarfs);
                break;
            } else if (sum > 100) {
                if (index == 0) {
                    break;
                } else if (index == 1) {
                    int temp = sum + inputDwarfs[0];
                    index = 0;

                    for (int i = 1; i < 8; i++) {
                        if (temp - inputDwarfs[i] == 100) {
                            for (int j = 0; j < 8; j++) {
                                if (j == i) {
                                    continue;
                                }

                                resultDwarfs[index++] = inputDwarfs[j];
                            }

                            break;
                        }
                    }

                    Arrays.sort(resultDwarfs);
                    printAll(resultDwarfs);
                    break;
                } else if (index == 2) {
                    int temp = sum + inputDwarfs[0] + inputDwarfs[1];

                    for (int i = 0; i < 3; i++) {
                        index = 0;
                        for (int j = i + 1; j < 9; j++) {
                            if (temp - inputDwarfs[i] - inputDwarfs[j] == 100) {
                                for (int k = 0; k < 9; k++) {
                                    if (k == i || k == j) {
                                        continue;
                                    }

                                    resultDwarfs[index++] = inputDwarfs[k];
                                }

                                break;
                            }
                        }
                    }

                    Arrays.sort(resultDwarfs);
                    printAll(resultDwarfs);
                    break;
                }
            } else {
                if (index == 2) {
                    break;
                }

                index++;
            }
        }
    }

    private static void printAll(int[] resultDwarfs) {
        for (int i = 0; i < 7; i++) {
            System.out.println(resultDwarfs[i]);
        }
    }
}
