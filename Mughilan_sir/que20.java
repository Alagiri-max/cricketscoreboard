package Mughilan_sir;

import java.util.Arrays;
import java.util.Scanner;

public class que20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        String[] result=a.split(" ");
        for(int i=0;i<result.length;i++)
        {
        	String ch=result[i];
        	char ch2=ch.charAt(0);
        	if(ch2>='a' && ch2<='z')
        	{
        		ch2=(char) (ch2-32);
        	}
        	result[i] = ch2 + ch.substring(1);
        }
        
        for(String word:result)
        {
        	System.out.print(word+" ");
        }
        		

	}

}
