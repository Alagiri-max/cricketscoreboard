package Pattern;

import java.util.Scanner;

public class right_triangle 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<n-i-1;s++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
