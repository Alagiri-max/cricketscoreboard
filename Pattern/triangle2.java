package Pattern;

import java.util.Scanner;

public class triangle2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<n-i ;s++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>0 ;j--)
			{
				System.out.print(j+1 +" ");
			}
			for(int k=0;k<i+1;k++)
			{
				System.out.print(k+1 +" ");
			}
			System.out.println();
		}

	}

}
