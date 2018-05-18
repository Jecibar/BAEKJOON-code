import java.util.Scanner;
public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arry[][] = new int[100][100];
        int test;
		for(int testcase=1; testcase<=10; testcase++) {
            test = sc.nextInt();
			for(int height=0; height<arry.length; height++) {
				for(int width=0; width<arry[height].length; width++) {
					arry[height][width] = sc.nextInt();
				}
			}
			
			int maxHeight = 0;
			int maxWidth = 0;
			int maxDiagonalUp = 0;
			int maxDiagonalDown = 0;
			for(int height=0; height<arry.length; height++) {
				int tempHeight = 0;
				int tempWidth = 0;
				int tempDiagonalUp = 0;
				int tempDiagonalDown = 0;
				for(int width=0; width<arry[height].length; width++) {
					tempHeight = tempHeight + arry[height][width];
					tempWidth = tempWidth + arry[width][height];
					if(height==width) {
						tempDiagonalDown = tempDiagonalDown + arry[height][width];
					} if(height + width == 99) {
						tempDiagonalUp = tempDiagonalUp + arry[height][width];
					}
				}
				if(tempHeight > maxHeight) {
					maxHeight = tempHeight;
				} if(tempWidth > maxWidth) {
					maxWidth = tempWidth;
				} if(tempDiagonalDown > maxDiagonalDown) {
					maxDiagonalUp = tempDiagonalUp;
				} if(tempDiagonalUp > maxDiagonalUp) {
					maxDiagonalUp = tempDiagonalUp;
				}
			}
			System.out.println("#" + testcase + " " + Integer.max(Integer.max(maxHeight, maxWidth), Integer.max(maxDiagonalUp, maxDiagonalDown)));
		}
	}
}