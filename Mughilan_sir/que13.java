package Mughilan_sir;

import java.util.Arrays;
import java.util.Scanner;

public class que13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        
        String[] words=a.split(" ");
        for(int i=0;i<words.length;i++)
        {
        	for(int j=i+1;j<words.length;j++)
        	{
        		if(words[i].length()>words[j].length())
        		{
        			String temp = words[i];
        			words[i]= words[j];
        			words[j]=temp;
        		}
        	}
        	
        }        
        String ch=words[words.length-1];
        System.out.println(ch);

	}

}
