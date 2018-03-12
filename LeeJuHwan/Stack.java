package study_baejoon;
import java.util.Scanner;

public class Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String order;
		int n;
		int pushNum = 0;
		String temp;
		System.out.println("n");
		n = sc.nextInt();
		String dummy = sc.nextLine();
		int arry[] = new int[n];
		for(int i=1; i<=n; i++)
		{
			order = sc.nextLine();
			switch(order)
			{
				case "pop":
					pop(arry);
					break;
					
				case "size":
					size(arry);
					break;
					
				case "empty":
					empty(arry);
					break;
					
				case "top":
					top(arry);
					break;
					
				default:
					temp = order.replace("push ", "");
					pushNum = Integer.parseInt(temp);
					push(arry, pushNum);
					break;
			}
		}
	}
	public static void push(int arry[], int x)
	{
		for(int i=0; i<arry.length; i++)
		{
			if(arry[i] == 0)
			{
				arry[i] = x;
				return;
			}
		}
	}
	public static void pop(int arry[])
	{
		for(int i=arry.length-1; i>=0; i--)
		{
			if(arry[i] > 0)
			{
				System.out.println(arry[i]);
				arry[i] = 0;
				return;
			}
		}
		System.out.println(-1);
	}
	public static void size(int arry[])
	{
		int count = 0;
		for(int i=0; i<arry.length; i++)
		{
			if(arry[i] > 0)
			{
				count = count + 1;
			}
		}
		System.out.println(count);
	}
	public static void empty(int arry[])
	{
		for(int i=0; i<arry.length; i++)
		{
			if(arry[i] > 0)
			{
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
	public static void top(int arry[])
	{
		for(int i=arry.length-1; i>=0; i--)
		{
			if(arry[i] > 0)
			{
				System.out.println(arry[i]);
				return;
			}
		}
		System.out.println(-1);
	}
}