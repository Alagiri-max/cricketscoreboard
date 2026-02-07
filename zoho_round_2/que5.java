package zoho_round_2;

import java.util.*;

public class que5 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[4][4];
		int result=0;
		int len=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			arr[i][j]=sc.nextInt();
			if(i==len-1 && j==0|| (i+j)==0 || i==0 && j==len-1 || i==len-1 && j==len-1)
			{
				if(arr[i][j]==1)
				{
					result++;
				}
			}
			}
		}
		System.out.println(result);
	}

}
