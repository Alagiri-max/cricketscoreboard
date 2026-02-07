package Mughilan_sir;

import java.util.Scanner;

public class que29 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
        String a = sc.nextLine();
        System.out.print("Enter Second String: ");
        String b = sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
        	char ch=a.charAt(i);
        	if(b.contains(String.valueOf(ch)))
        	{
        		count++;
        	}
        	
        }
        if(count==a.length())
    		System.out.println("YES");
        else
        	System.out.println("NO");

	}

}
