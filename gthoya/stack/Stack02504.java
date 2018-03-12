package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack02504 {
    public static void main (String[] ar) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        String inputString = scanner.next();
        int size = inputString.length();
        Character currentChar = ' ', beforeChar, currentStackChar;
        int mul = 1, result = 0;
        boolean isSingle = true;

        for (int i = 0; i < size; i++) {
            beforeChar = currentChar;
            currentChar = inputString.charAt(i);

            if (currentChar == ')') {
                if (stack.isEmpty()) {
                    result = 0;
                    break;
                }

                currentStackChar = stack.pop();
                if (stack.isEmpty()) {
                    if (currentStackChar != '(') {
                        result = 0;
                        break;
                    }

                    if (isSingle) {
                        result += mul;
                    }

                    mul /= 2;
                    continue;
                }

                if (currentStackChar == '(') {
                    if (beforeChar != ']' && beforeChar != ')') {
                        result += mul;
                    }

                    mul /= 2;
                } else {
                    result = 0;
                    break;
                }
            } else if (currentChar == ']') {
                if (stack.isEmpty()) {
                    result = 0;
                    break;
                }

                currentStackChar = stack.pop();
                if (stack.isEmpty()) {
                    if (currentStackChar != '[') {
                        result = 0;
                        break;
                    }

                    if (isSingle) {
                        result += mul;
                    }

                    mul /= 3;
                    continue;
                }

                if (currentStackChar == '[') {
                    if (beforeChar != ']' && beforeChar != ')') {
                        result += mul;
                    }

                    mul /= 3;
                } else {
                    result = 0;
                    break;
                }
            } else if (currentChar == '(') {
                if (stack.isEmpty()) {
                    isSingle = true;
                } else {
                    isSingle = false;
                }

                mul *= 2;
                stack.push(currentChar);
            } else if (currentChar == '[') {
                if (stack.isEmpty()) {
                    isSingle = true;
                } else {
                    isSingle = false;
                }

                mul *= 3;
                stack.push(currentChar);
            }
        }

        System.out.println(stack.isEmpty() ? result : 0);
    }
}
