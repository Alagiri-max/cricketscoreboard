package Mughilan_sir;

import java.util.Scanner;

public class que6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++)
        {
            int count = 0;

            for (int j = 0; j < a.length(); j++)
                if (a.charAt(i) == a.charAt(j))
                    count++;

            if (count == 1)
            {
                System.out.println("First non-repeating character: " + a.charAt(i));
                break;
            }
        }
    }
}
