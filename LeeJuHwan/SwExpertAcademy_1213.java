import java.util.Scanner;
public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input;
		String found;
		int test;
		int length;
		int count;
		int foundCnt = 0;
		for(int testcase=1; testcase<=10; testcase++) {
			test = sc.nextInt();
			found = sc.next();
			String dummy = sc.nextLine();
			input = sc.nextLine();
			
			char inputArry[] = input.toCharArray();
			char foundArry[] = found.toCharArray();
			length = foundArry.length;
			
			foundCnt = 0;
			for(int i=0; i<inputArry.length; i++) {
				count = 0;
				int index = 0;
				if(inputArry[i] == foundArry[0] && i != inputArry.length-1) {
					for(int j=i; j<i+length; j++) {
						if(inputArry[j] == foundArry[index] && j < inputArry.length) {
							count++;
							index++;
						}
					}
					if(count == length) {
						foundCnt++;
					}
				}
			}
			System.out.println("#" + testcase + " " + foundCnt);
		}
	}
}