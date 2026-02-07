package Mughilan_sir;

import java.util.Scanner;

public class que17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        int upper=0,lower=0;
        
        for(int i=0;i<a.length();i++)
        {
        	char ch=a.charAt(i);
        	if(ch>='a' && ch<='z')
        		lower++;
        	else if (ch>='A' && ch<='Z')
        		upper++;
        }
        System.out.print("Upper :"+upper+" , ");
        System.out.print("Lower :"+lower);
	}

}
