package Dharaneesh_sir;
import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch, i + 1) == -1) { 
                result += ch;
            }
        }

        System.out.println("Longest subsequence: " + result);
    }
}
