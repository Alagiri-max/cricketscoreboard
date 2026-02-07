package Arrays;

import java.util.*;

public class array46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elemnts in First Array : ");
		int n=sc.nextInt();
		System.out.print("Enter the Number of Elemnts in Second Array : ");
		int n2=sc.nextInt();
		int[] arr=new int[n];
		int[] arr2=new int[n2];
		int[] arr3=new int[n+n2];
		int k=0;
		System.out.print("Enter the Frist Array Elemnts :");		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter the Second Array Elemnts :");		
		for(int i=0;i<n2;i++)
			arr2[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			arr3[k++]=arr[i];
		for(int i=0;i<n2;i++)
			arr3[k++]=arr2[i];
		
		Arrays.sort(arr3);
		
//		System.out.println(Arrays.toString(arr3));
		
		double median;
			if(arr3.length%2==0)
			{
				int s=arr3.length/2;
				median=(arr3[s]+arr3[s+1])/2;
			}
			else
				median=arr3[(arr3.length/2)];
		System.out.println(median);
	}

}
