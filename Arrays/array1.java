package Arrays;

import java.util.*;

public class array1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elemnts in an Array : ");
		int n=sc.nextInt();
		int sum=0;
		int[] arr=new int[n];
		System.out.print("Enter the Elemnts :");		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
