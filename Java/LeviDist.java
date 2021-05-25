public class LeviDist {
    public int editDist(String inp1, String inp2) {
        int dist = 0, itr = 0;
        if (inp1.length() > inp2.length()) {
            dist = Math.abs(inp1.length() - inp2.length());
            itr = inp2.length();
        } else {
            dist = Math.abs(inp2.length() - inp1.length());
            itr = inp1.length();
        }
        System.out.println("dist1 " + itr);
        for (int i = 0; i < itr; i++) {
            if (inp1.charAt(i) != inp2.charAt(i)) {
                System.out.println(inp1.charAt(i) + " " + inp2.charAt(i));
                dist++;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int eval = new LeviDist().editDist("sitting", "kitten");
        System.out.println(eval);
    }
}
