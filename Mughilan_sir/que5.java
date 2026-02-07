package Mughilan_sir;

import java.util.Scanner;

public class que5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        System.out.print("{");

        for (int i = 0; i < a.length(); i++)
        {
            int count = 0;

            for (int j = 0; j < a.length(); j++)
                if (a.charAt(i) == a.charAt(j))
                    count++;

            if (a.indexOf(a.charAt(i)) == i)
                System.out.print(a.charAt(i) + " = " + count+" ,");
            
        }
        System.out.print("}");
    }
}
