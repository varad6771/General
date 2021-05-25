import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMult {
    public void getMult(int[] arr) {
        ArrayList<Integer> olist = new ArrayList<>();
        Arrays.sort(arr);
        int m = arr.length - 1;

        int m1 = arr[0] * arr[1] * arr[2] * arr[3];
        int m2 = arr[m] * arr[m - 1] * arr[m - 2] * arr[m - 3];
        int m3 = arr[0] * arr[1] * arr[m] * arr[m - 1];
//        System.out.println("m1 = " + m1 + " m2 =  " + m2 + " m3 = " + m3);
        olist.add(m1);
        olist.add(m2);
        olist.add(m3);
        Collections.sort(olist);
        System.out.println("olist.get(m) = " + olist.get(olist.size() - 1));
    }

    public static void main(String[] args) {
//        int[] arr = {-3, 1, 2, -2, 5, 6, 1, 0};
        int[] arr = {3, 3, 3, 3, 3};
        new MaxMult().getMult(arr);
    }
}
