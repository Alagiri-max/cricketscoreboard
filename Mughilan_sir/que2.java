package Mughilan_sir;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a=sc.nextLine();
		
		String b="";
			for(int i=a.length()-1;i>=0;i--)
			{
				
				b+=a.charAt(i);
			}
			
		if(a.equals(b))
			System.out.println("Palindrome");
		else
			System.out.println("Not Paindrome");

	}

}
