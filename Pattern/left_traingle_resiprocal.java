package Pattern;

import java.util.Scanner;

public class left_traingle_resiprocal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
