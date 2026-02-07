package Arrays;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int odd=0,even=0;
		System.out.print("Enter the Number of Elemnts in an Array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the Elemnts :");		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2 ==0 )
				even++;
			else
				odd++;
		}
		System.out.println("Even = "+even+", Odd = "+odd);
		

	}

}
