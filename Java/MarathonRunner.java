import java.util.ArrayList;
import java.util.Collections;

public class MarathonRunner {
    public void topRunners(float[] runners, float tdist) {
        ArrayList<Float> olist = new ArrayList<>();
        for (float distr : runners) {
            if (distr != tdist)
                olist.add(distr);
        }
        Collections.sort(olist);
        Collections.reverse(olist);

        System.out.println(olist.get(0) + " " + olist.get(1) + " " + olist.get(2));

    }

    public static void main(String[] args) {
        float[] arr = new float[]{42.195f, 42.195f, 42.195f, 33.25f, 40f, 41.2f, 38.9f, 37.5f};
        new MarathonRunner().topRunners(arr, 42.195f);
    }
}
