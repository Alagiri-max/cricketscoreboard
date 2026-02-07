package Pattern;

import java.util.Scanner;

public class diomand 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int s=0;s<n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<=i;s++) 
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
