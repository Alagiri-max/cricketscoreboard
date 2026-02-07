package Arrays;
import java.util.Scanner;

public class zoho1sttime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < n; i++) 
        	arr[i] = sc.nextInt();

        for (int i = 0; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 1; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) 
        	System.out.print(arr[i] + " ");
    }
}
