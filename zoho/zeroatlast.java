package zoho;

import java.util.*;

public class zeroatlast{
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 0, 3, 9, 0, 2, 0, 1};

        int index = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
