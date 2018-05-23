package backjoon.dynamicrule;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] sr) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> kangaroo = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            kangaroo.add(scanner.nextInt());
        }

        kangaroo.sort(Comparator.naturalOrder());
        int temp1 = kangaroo.get(2) - kangaroo.get(1);
        int temp2 = kangaroo.get(1) - kangaroo.get(0);

        System.out.println((temp1 > temp2 ? temp1 : temp2) - 1);
    }
}
