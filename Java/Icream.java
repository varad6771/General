import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Icream {

    static int getKey(HashMap<Integer, Integer> map, int val) {
        for (Integer key : map.keySet()) {
            if (map.get(key) == val)
                return key;
        }
        return -1;
    }


    static void whatFlavors(int[] arr, int n) {
        int aa = 0, ab = 0, aval = 0, bval = 0;
        int[] op = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++)
            map.put(i, arr[i]);


        for (int i = 0; i < map.size() - 1; i++) {
            aa = map.get(i);
            if (map.containsValue(n - aa)) {
                aval = i;
                // bval = getKey(map, (n - aa));
            }

        }

        System.out.println(aval + " " + bval);
        op[0] = aval;
        op[1] = bval;
        Arrays.sort(op);
        System.out.println(op[0] + " " + op[1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
