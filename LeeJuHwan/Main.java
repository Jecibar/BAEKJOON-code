import java.util.*;
public class Main
{
	public static void main(String args[]) 
	{
		//규칙찾기 1193번
//		Scanner sc = new Scanner(System.in);
//		int x;
////		int first = 1;
////		int end = 1;
////		int count = 2;
////		int for_count = 1;
//		int x_count = 1;
//		int top;
//		int bottom;
//		System.out.println("입력");
//		x = sc.nextInt();
//		boolean dir = false; // false=홀수, true=짝수
//		while(true)
//		{
//			if(dir == false)
//			{
//				top = x_count;
//				bottom = 1;
//				for(int i=1; i<x_count; i++)
//				{
//					if(x==x_count)
//					{
//						System.out.println(top + "/" + bottom);
//						break;
//					}
//					top--;
//					bottom++;
//				}
//			}
//			else
//			{
//				top = 1;
//				bottom = x_count;
//				for(int i=1; i<x_count; i++)
//				{
//					if(x == x_count)
//					{
//						System.out.println(top + "/" + bottom);
//						break;
//					}
//					top++;
//					bottom--;
//				}
//			}
//			x_count++;
//			dir = !dir;
//		}
		
		
		
		
		//1475번
		Scanner sc = new Scanner(System.in);
		String n;
		int sum = 0;
		int result;
		int max = -1;
		int countArry[] = {0, 0 , 0, 0, 0, 0, 0, 0, 0, 0}; //0~9 중 몇번 나왔는지 체크하는 배열
		char number[] = {'0', '1', '2','3' ,'4' ,'5', '6', '7', '8', '9'}; //0~9 세팅
//		System.out.println("n");
		n = sc.next();
		char arry[] = n.toCharArray(); //입력을 문자배열로 변환
		for(int i=0; i<arry.length; i++)
		{
			for(int j=0; j<number.length; j++) //0~9 반복
			{
				if(arry[i]==number[j]) //입력한 수와 일치하는 원소의 개수 증가
				{
					countArry[j]++;
					if(max < countArry[j] && number[j] != '6' && number[j] != '9') //6, 9를 제외, max보다 크다면 max값 갱신
					{
						max = countArry[j];
					}
				}
			}
		}
		sum = countArry[6]+countArry[9]; //6과 9가 나온 수를 sum
		result = sum%2==0 ? sum/2 : (sum/2)+1; //더한 값이 짝수면 /2, 홀수면 /2+1
		if(max > result)
		{
			System.out.println(max);
		}
		else
		{
			System.out.println(result);
		}
	}
}