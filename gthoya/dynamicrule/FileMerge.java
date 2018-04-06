package dynamicrule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMerge {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        int inputCount;
        List<Integer> inputList;
        int min, minIndex, result;

        for (int i = 0; i < orderCount; i++) {
            inputCount = scanner.nextInt();
            inputList = new ArrayList<Integer>();
            minIndex = 0;
            result = 0;

            for (int j = 0; j < inputCount; j++) {
                inputList.add(scanner.nextInt());
            }

            while (inputList.size() > 2) {
                min = Integer.MAX_VALUE;
                for (int j = 0; j < inputList.size() - 1; j++) {
                    if (min > inputList.get(j) + inputList.get(j + 1)) {
                        minIndex = j;
                        min = inputList.get(j) + inputList.get(j + 1);
                    }
                }

                result += inputList.get(minIndex) + inputList.get(minIndex + 1);
                inputList.set(minIndex, inputList.get(minIndex) + inputList.get(minIndex + 1));
                inputList.remove(minIndex + 1);
            }

            System.out.println(result + inputList.get(0) + inputList.get(1));
        }
    }
}
