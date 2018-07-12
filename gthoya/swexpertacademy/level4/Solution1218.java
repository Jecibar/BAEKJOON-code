package swexpertacademy.level4;

import java.util.Scanner;
import java.util.Stack;

public class Solution1218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack;
        String input;
        char currentChar;
        int orderCount;
        boolean isSuccess;


        for (int i = 1; i <= 10; i++) {
            stack = new Stack<Character>();
            isSuccess = true;
            orderCount = scanner.nextInt();
            input = scanner.next();

            for (int j = 0; j < orderCount; j++) {
                currentChar = input.charAt(j);

                if (currentChar == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isSuccess = false;
                        break;
                    }
                } else if (currentChar == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isSuccess = false;
                        break;
                    }
                } else if (currentChar == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        isSuccess = false;
                        break;
                    }
                } else if (currentChar == '>') {
                    if (stack.isEmpty() || stack.pop() != '<') {
                        isSuccess = false;
                        break;
                    }
                } else {
                    stack.push(currentChar);
                }
            }

            if (stack.isEmpty() && isSuccess) {
                System.out.println("#" + i + " " + 1);
            } else {
                System.out.println("#" + i + " " + 0);
            }
        }
    }
}
