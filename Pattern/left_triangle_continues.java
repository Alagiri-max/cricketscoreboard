package Pattern;

import java.util.Scanner;

public class left_triangle_continues 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i+j +" ");
			}
			System.out.println();
		}

	}

}
