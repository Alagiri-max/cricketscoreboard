package Arrays;

import java.util.*;

public class Array47 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elemnts in an Array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the Elemnts :");		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.print("Enter the Kth Value:");
		int k=sc.nextInt();
		
		
		Arrays.sort(arr);
		
		System.out.println(k+"th Largest Element is: "+arr[arr.length-k]);
		
		

	}

}
