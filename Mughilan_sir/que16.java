package Mughilan_sir;

import java.util.Scanner;

public class que16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        
        String result="";
        
        for(int i=0;i<a.length();i++)
        {
        	char ch=a.charAt(i);
        	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        		result=result+ch;
        }
        System.out.println(result);

	}

}
