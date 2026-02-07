package Mughilan_sir;

import java.util.Scanner;

public class que12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        
        String[] words=a.split(" ");
        for(int i=0;i<words.length;i++)
        {
        	String ch=words[i];
        	for(int j=ch.length()-1;j>=0;j--)
        	{
        		System.out.print(ch.charAt(j));
        		
        	}
        	System.out.print(" ");
        }        

	}

}
