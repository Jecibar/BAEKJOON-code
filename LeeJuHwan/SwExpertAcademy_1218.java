import java.util.*;
public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("start");
		for(int testcase=1; testcase<=10; testcase++) {
			int length = sc.nextInt();
			String dummy = sc.nextLine();
			String input = sc.nextLine();
			char arry[] = input.toCharArray();
			int result = judge(arry, length);
			System.out.println("#" + testcase + " " + result);
		}
	}
	
	public static int judge(char arry[], int length) {
		int i = 0;
		int deleteCnt = 0;
		while(i < arry.length - 1) {
			
			switch(arry[i]) {
				case '(':
					for(int j=i; j<arry.length; j++) {
						if(arry[j] == ')') {
							arry[i] = arry[j] = ' ';
							deleteCnt++;
							break;
						} else{
							continue;
						}
					}
					break;
					
				case '[':
					for(int j=i; j<arry.length; j++) {
						if(arry[j] == ']') {
							arry[i] = arry[j] = ' ';
							deleteCnt++;
							break;
						} else{
							continue;
						}
					}
					break;
					
				case '{':
					for(int j=i; j<arry.length; j++) {
						if(arry[j] == '}') {
							arry[i] = arry[j] = ' ';
							deleteCnt++;
							break;
						} else{
							continue;
						}
					}
					break;
					
				case '<':
					for(int j=i; j<arry.length; j++) {
						if(arry[j] == '>') {
							arry[i] = arry[j] = ' ';
							deleteCnt++;
							break;
						} else{
							continue;
						}
					}
					break;
			}
			i++;
		}
		return deleteCnt == length/2 ? 1 : 0;
	}
}