package zoho;

import java.util.Arrays;

public class second_largest 
{
		public static int second_largest(int[] arr) 
		{
			if(arr.length<2)
			{
				System.out.println("Give the Minimum 2 Elements to the Array");
				return -1;
			}
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr[arr.length-2];
			
			
		}
			
		public static void main(String[] args) 
		{
			int[] arr= {1,2,3,2,4,9,5,7};
			System.out.println(second_largest(arr)); //User defined Method
			
			//Built in Method
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println(arr[arr.length-2]);
			
		}
	
}
