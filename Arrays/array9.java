package Arrays;

import java.util.Scanner;

public class array9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elemnts in an Array : ");
		int n=sc.nextInt();
		int count=1;
		int[] arr=new int[n];
		System.out.print("Enter the Elemnts :");		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==-1)
				continue;
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}
			System.out.println(arr[i]+":"+count);
		}

	}

}
