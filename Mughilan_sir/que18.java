package Mughilan_sir;

import java.util.Scanner;

public class que18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        int result=0;
        
        for(int i=0;i<a.length();i++)
        {
        	int ch=(char) a.charAt(i);
        	result+=ch;
        	
        }
        System.out.println(result);
	}

}
