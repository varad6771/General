import java.util.*;
import java.lang.*;

public class LeviDist {
	public int editDist(String inp1, String inp2){
		int dist = 0;

		dist = Math.abs(inp1.length() - inp2.length());
		// System.out.println("dist1 "+dist);
		for (int i = 0; i < inp1.length(); i++) {
				if (inp1.charAt(i) != inp2.charAt(i)) {
					// System.out.println(inp1.charAt(i)+" "+inp2.charAt(i));
					dist++;
				}
		}

		return dist;
	}

	public static void main(String[] args){
		int eval = new LeviDist().editDist("kitten", "sitting");
		System.out.println(eval);
	}
}
