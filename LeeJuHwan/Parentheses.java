package study_baejoon;
import java.util.Scanner;

public class Parentheses
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input;
		char arry[];
		System.out.println("t");
		int t = sc.nextInt();
		for(int i=1; i<=t; i++)
		{
			System.out.println("input");
			input = sc.next();
			arry = input.toCharArray();
			judgementVPS(arry);
		}
	}
	public static void judgementVPS(char arry[])
	{
		int i = 0;
		int deleteCnt = 0;
		if(arry.length%2 != 0 || arry[0] == ')')
		{
			System.out.println("NO");
			return;
		}
		while(i < arry.length-1)
		{
			if(arry[i] == '(')
			{
				for(int j=i; j<arry.length; j++)
				{
					if(i != arry.length-1)
					{
						if(arry[j] == ')')
						{
							arry[i] = ' ';
							arry[j] = ' ';
							deleteCnt++;
							break;
						}
					}
				}
			}
			i++;
		}
		if(deleteCnt == arry.length/2)
		{
			System.out.println("YES");
			return;
		}
		else
		{
			System.out.println("NO");
			return;
		}
	}
}