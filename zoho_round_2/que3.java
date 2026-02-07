package zoho_round_2;

public class que3
{

	public static void main(String[] args)
	{
		int[] height= {1,8,6,2,5,4,8,3,7};
		int x=0;
		for(int i=0;i<height.length;i++)
		{
			for(int j=i+1;j<height.length;j++)
			{
				if(height[i]<height[j])
					x=height[j];
			}
		}
		System.out.println(x*x);
		
		

	}

}
