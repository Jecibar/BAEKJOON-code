package dynamicrule;

import java.util.Scanner;

public class Coin {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coin = new int[n];
        int[] result = new int[k + 1];

        for (int i = 0; i < n; i++) {
            coin[i] = scanner.nextInt();
        }

        result[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                result[j] += result[j - coin[i]];
            }
        }

        System.out.println(result[k]);
    }
}
