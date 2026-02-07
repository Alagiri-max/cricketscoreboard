package Dharaneesh_sir;

import java.util.Scanner;

public class Numberpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = i;  
            for (int j = 1; j <= i+1; j++) {
                System.out.print(num+1 + " ");
                num += (n - j);
            }
            System.out.println();
        }
    }
}
