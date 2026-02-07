package Dharaneesh_sir;

import java.util.Scanner;

public class question4 
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)
		{
        	for(int s=0;s<i;s++)
			{
				System.out.print(" ");
			}
        	for(int j=0;j<n-i;j++)
			{
				System.out.print(n-j);
			}
			System.out.println();
		}
        
    }
        

}
