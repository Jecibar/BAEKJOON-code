import java.util.*;
public class Main
{
	public static void main(String args[]) 
	{
		//��Ģã�� 1193��
//		Scanner sc = new Scanner(System.in);
//		int x;
////		int first = 1;
////		int end = 1;
////		int count = 2;
////		int for_count = 1;
//		int x_count = 1;
//		int top;
//		int bottom;
//		System.out.println("�Է�");
//		x = sc.nextInt();
//		boolean dir = false; // false=Ȧ��, true=¦��
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
		
		
		
		
		//1475��
		Scanner sc = new Scanner(System.in);
		String n;
		int sum = 0;
		int result;
		int max = -1;
		int countArry[] = {0, 0 , 0, 0, 0, 0, 0, 0, 0, 0}; //0~9 �� ��� ���Դ��� üũ�ϴ� �迭
		char number[] = {'0', '1', '2','3' ,'4' ,'5', '6', '7', '8', '9'}; //0~9 ����
//		System.out.println("n");
		n = sc.next();
		char arry[] = n.toCharArray(); //�Է��� ���ڹ迭�� ��ȯ
		for(int i=0; i<arry.length; i++)
		{
			for(int j=0; j<number.length; j++) //0~9 �ݺ�
			{
				if(arry[i]==number[j]) //�Է��� ���� ��ġ�ϴ� ������ ���� ����
				{
					countArry[j]++;
					if(max < countArry[j] && number[j] != '6' && number[j] != '9') //6, 9�� ����, max���� ũ�ٸ� max�� ����
					{
						max = countArry[j];
					}
				}
			}
		}
		sum = countArry[6]+countArry[9]; //6�� 9�� ���� ���� sum
		result = sum%2==0 ? sum/2 : (sum/2)+1; //���� ���� ¦���� /2, Ȧ���� /2+1
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