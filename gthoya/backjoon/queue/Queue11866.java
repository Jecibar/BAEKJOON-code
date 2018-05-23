package backjoon.queue;

import java.util.Scanner;

public class Queue11866 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int currentPerson = 0;
        boolean[] notExistPerson = new boolean[n];

        System.out.print("<");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                currentPerson = (currentPerson + 1) % n;
                currentPerson = (currentPerson == 0 ? n : currentPerson);
                if (notExistPerson[currentPerson - 1]) {
                    j--;
                    continue;
                }
            }

            notExistPerson[currentPerson - 1] = true;

            System.out.print(currentPerson);
            if ((i + 1) != n) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
