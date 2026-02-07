package Arrays;

import java.util.*;

public class array8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;   
                }
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1)
                System.out.print(arr[i] + " ");
        }
    }
}
