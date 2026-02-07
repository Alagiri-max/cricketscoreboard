package Pattern;

import java.util.Scanner;

public class kpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i ;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<i+2;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
