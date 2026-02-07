package Mughilan_sir;

import java.util.Scanner;

public class que15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String a = sc.nextLine();
        System.out.print("Enter Second String: ");
        String b = sc.nextLine();
        
        if(a.length()==b.length() && (a+b).contains(b))
        	System.out.println("YES");
        else
        	System.out.println("NO");
	}

}
