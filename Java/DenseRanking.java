import java.util.*;

public class DenseRanking {
    // condition var used to handle case where 2 times insert needed due to t>k but t<k-1
    public void addElement(int val, List<Integer> olist, int condition) {
//        System.out.println("in olist " + val + " con " + condition);
        if (!olist.contains(val) && condition != 1)
            olist.add(val);
        else if (condition == 1)
            olist.add(val);
    }

    private void getRanks(int[] scores, int[] player) {
        int i = 0, temp = 0;
        List<Integer> olist = new ArrayList<>();

        // deduplicate
        Set<Integer> rankSet = new HashSet<>();
        for (int no : scores)
            rankSet.add(no);
        ArrayList<Integer> rlist = new ArrayList<>(rankSet);
        rankSet.clear();
        Collections.sort(rlist);
        Collections.reverse(rlist);
//        System.out.println("rlist = " + rlist);
//        Arrays.stream(player).forEach(e -> System.out.print(e + " "));
//        System.out.println();


        int k = rlist.size() - 1;
        while (i < player.length) {
            temp = player[i];
            while (k > 0) {
//                System.out.println("k = " + k + " temp " + temp + " rk " + rlist.get(k));
                if (temp > rlist.get(k) && temp < rlist.get(k - 1)) {
                    addElement(k + 1, olist, 1);
                } else if (temp < rlist.get(rlist.size() - 1)) {
                    addElement(rlist.size() + 1, olist, 2);
                } else if (temp > rlist.get(0)) {
                    addElement(1, olist, 3);
                } else if (temp == rlist.get(k)) {
                    addElement(k + 1, olist, 4);
                }

                k--;
            }
            k = rlist.size() - 1;
            i++;
        }

        System.out.println("olist = " + olist);
    }

    public static void main(String[] args) {
        int[] scores = {100, 90, 90, 85, 80, 70, 70, 70, 60};
        int[] player = new int[]{55, 70, 75, 85, 90, 105};
        new DenseRanking().getRanks(scores, player);
    }
}
