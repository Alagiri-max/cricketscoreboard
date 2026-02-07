package zoho_round_2;

import java.util.*;

public class que2
{

	public static void main(String[] args)
	{
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		
//		Arrays.sort(nums);
//
//		System.out.println(Arrays.toString(nums));

		for(int i=0;i<nums.length;i++)
		{
			sum=0;
			for(int j=i+1;j<nums.length;j++,i++)
			{
				sum=nums[i]+nums[j];
				System.out.println(sum);
			}
			
			
		}
		
		
		

	}

}
