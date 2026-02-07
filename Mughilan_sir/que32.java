package Mughilan_sir;

import java.util.Scanner;

public class que32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String a = sc.nextLine();
        System.out.print("Enter Second String: ");
        String b = sc.nextLine();
        
        int first=Integer.parseInt(a);
        int second=Integer.parseInt(b);
        
        int ans= first+second;
        System.out.println("Answer:"+ans);

	}

}
