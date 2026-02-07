package Mughilan_sir;

import java.util.Scanner;

public class que8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        String vow="";
        
        for(int i=0;i<a.length();i++)
        {
        	char ch=a.charAt(i);
        	if("aeiouAEIOU".indexOf(a.charAt(i))==-1)
        	{
        		vow = vow+ch;
        	}
        
        }
        System.out.println(vow);

	}

}
