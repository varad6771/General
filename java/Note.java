import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Note {
	public static HashMap<String, Integer> getMap(String [] arr){
		Integer n = 0;
		String val = null;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
    	for (String word : arr) {
        	n = map.get(word);
        	n = (n == null) ? 1 : ++n;
        	map.put(word, n);
    	}

		return map;
	}

	public static boolean checkFreq(HashMap<String, Integer> mag, HashMap<String, Integer> nt){
		int ctr = 0;
		Integer v1 = 0, v2 = 0;
		String key = null;
		for (Map.Entry<String,Integer> entry : nt.entrySet())  {
			key = entry.getKey();
			if (mag.containsKey(key) && nt.containsKey(key)) {
				
				v1 = mag.get(key); v2 = nt.get(key);
				// System.out.println(key+" - "+v1 +" - "+v2);
				if (v1 == v2 || v2 < v1)
					ctr++;				
			} else  {
				break;
			}


		}

		if (ctr == nt.size()) 
			return true;
		return false;
	}

	static void checkMagazine(String[] magazine, String[] note) {
		int ctr = 0;
		HashMap<String, Integer> mag = new HashMap<String, Integer>();
		HashMap<String, Integer> nt = new HashMap<String, Integer>();

		if (magazine.length < note.length) {
			System.out.println("No");
		} else {
			mag = getMap(magazine);
			// System.out.println("mag");
			// for (Map.Entry<String,Integer> entry : mag.entrySet()) 
			// 	System.out.println(entry.getKey() +" - "+entry.getValue());
			
			// System.out.println();
			nt = getMap(note);
			// System.out.println("nt");
			// for (Map.Entry<String,Integer> entry : nt.entrySet()) 
			// 	System.out.println(entry.getKey() +" - "+entry.getValue());
			
			// System.out.println();
			
			for (int j = 0; j < note.length; j++) {
				if (mag.containsKey(note[j])) {
					ctr ++ ;				
				}
			}
			boolean status = checkFreq(mag, nt);
			// System.out.println(ctr+" "+status);	

			if (ctr == note.length && status == true) 
				System.out.println("Yes");
			else
				System.out.println("No");
		}	
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String magazineItem = null;
		String noteItem = null;
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		// System.out.println("mag 1");
		for (int i = 0; i < m; i++) {
			magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		// System.out.println("mag 2");
		for (int i = 0; i < n; i++) {
			noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
