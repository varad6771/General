/**
 * A jail has a number of prisoners and a number of treats to pass out to them.
 * Their jailer decides the fairest way to divide the treats is to seat the prisoners around a circular table
 * in sequentially numbered chairs. A chair number will be drawn from a hat.
 * Beginning with the prisoner in that chair, one candy  to each prisoner sequentially until all have been distributed.
 * The jailer is playing a little joke. The last one tastes awful.
 * Determine the chair number occupied by the prisoner who will receive that candy.
 * For example, there are 4 prisoners and 6 pieces of candy.
 * The prisoners arrange themselves in seats numbered 1 to 4 .
 * Let’s suppose two are drawn from the hat. Prisoners receive candy at positions 2,3,4,1,2,3.
 * The prisoner to be warned sits in chair number 3
 * <p>
 * Function Description
 * Write a function saveThePrisoner. It should return an integer representing the chair number of the prisoner to warn.
 * has the following parameter(s):
 * n: an integer, the number of prisoners
 * m: an integer, the number of sweets
 * s: an integer, the chair number to begin passing out sweets from
 * <p>
 * Input Format
 * The first line contains an integer t, denoting the number of test cases.
 * The next t lines each contain 3 space-separated integers:
 * – : n the number of prisoners
 * – : m the number of sweets
 * – : s the chair number to start passing out treats at
 * <p>
 * Output Format
 * For each test case, print the chair number of the prisoner who receives the awful treat on a new line.
 * Sample Input
 * 2
 * 5 2 1
 * 5 2 2
 * Sample Output
 * 2
 * 3
 */


public class JailTreat {
    public int saveThePrisoner(int sno, int tpris, int start) {
        int pnum = 0;
        if (start + (sno - 1) <= tpris) {
            pnum = start + (sno - 1);
        } else {
            while (sno >= 0) {
                if (start + (sno - 1) > tpris) {
                    sno = start + (sno - 1) - tpris;
                    start = 1;
                } else {
                    pnum = start + (sno - 1);
                    sno = start + (sno - 1) - tpris;
                }
            }
        }
        return pnum;
    }

    public static void main(String[] args) {
        int prisoner = new JailTreat().saveThePrisoner(20, 5, 3);
        System.out.println("prisoner = " + prisoner);
    }
}
