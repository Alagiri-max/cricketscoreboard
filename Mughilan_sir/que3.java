package Mughilan_sir;

import java.util.Scanner;

public class que3 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a=sc.nextLine();
		int v=0,nv=0;
		
		for(int i=0;i<a.length();i++)
		{
			if("aeiouAEIOU".indexOf(a.charAt(i)) == -1)
				v++;
			else
				nv++;
		}
		
		System.out.println("Vowels:"+v);
		System.out.println("Constants:"+nv);

	}

}
