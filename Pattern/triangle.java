package Pattern;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<n-i-1;s++) 
			{
				System.out.print(" ");
			}
			for(int j=0;j<i+1; j++)
			{
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}

	}

}
