package zoho;
import java.util.*;

public class arraymerge {
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 5, 6};
        int[] b = {2, 3, 4, 5, 6, 7};

        Set<Integer> result = new TreeSet<>();

        for (int i = 0; i < a.length; i++) {
            result.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            result.add(b[i]);
        }

        System.out.println(result);
    }
}
