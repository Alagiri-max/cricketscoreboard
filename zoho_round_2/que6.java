package zoho_round_2;

import java.util.*;
public class que6 
{

	public static void main(String[] args)
	{
		int[] arr= {5,10,-5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
			if(arr[i]<0)
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
