package Arrays;

import java.util.Scanner;

public class array10 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elemnts in an Array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int odd=0,even=0;
		System.out.print("Enter the Elemnts :");		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(i%2==0)
				even+=arr[i];
			else
				odd+=arr[i];
		}
		System.out.println("Even Index Sum:"+even);
		System.out.println("Odd Index Sum:"+odd);
		
	}

}
