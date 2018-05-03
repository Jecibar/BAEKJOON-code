package divide;

import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int squareCount;
        long[] height;
        long maxArea, tempMaxArea, minHeight = 0;

        while (true) {
            squareCount = scanner.nextInt();
            if (squareCount == 0) {
                break;
            }

            maxArea = 0;
            height = new long[squareCount];
            for (int i = 0; i < squareCount; i++) {
                height[i] = scanner.nextInt();
            }

            for (int i = 0; i < squareCount; i++) {
                tempMaxArea = 0;
                for (int j = i; j < squareCount; j++) {
                    if (j == i) {
                        minHeight = height[j];
                    } else if (height[j] < minHeight) {
                        minHeight = height[j];
                    }

                    tempMaxArea = (tempMaxArea > minHeight * (j - i + 1) ? tempMaxArea : minHeight * (j - i + 1));
                    if (minHeight * (squareCount - j + 1) < maxArea || minHeight * (squareCount - j + 1) < tempMaxArea) {
                        break;
                    }
                }

                maxArea = (maxArea > tempMaxArea ? maxArea : tempMaxArea);
            }

            System.out.println(maxArea);
        }
    }
}
