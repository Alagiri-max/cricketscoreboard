package Mughilan_sir;

import java.util.Arrays;
import java.util.Scanner;

public class que10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter First string: ");
        String a = sc.nextLine();
        System.out.print("Enter Second String: ");
        String b = sc.nextLine();
        
        char one[]=a.toCharArray();
        char two[]=b.toCharArray();
        
        Arrays.sort(one);
        Arrays.sort(two);
        
        if(Arrays.equals(one, two))
        	System.out.println("Anagram");
        else
        	System.out.println("Not an Anagram");
        

	}

}
