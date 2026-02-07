package Mughilan_sir;

import java.util.Scanner;

public class que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }
            else {
                result += ch;
            }
        }

        System.out.println("Output: " + result);
    }
}
