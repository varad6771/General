import java.util.HashMap;
import java.util.Map;

//AAAABBBCCDAA
public class RunLength {

    public String charEncode(String s) {
        StringBuilder sb = new StringBuilder();
        char[] word = s.toCharArray();
        char current = word[0];

        int index = 0;
        int count = 0;

        for (char c : word) {
            if (c == current) {
                count++; index++;
                if (index == word.length) {
                    // System.out.println("in if "+current+" "+Integer.toString(count));
                    sb.append(Integer.toString(count) + current);
                }
            } else {
                // System.out.println("in else "+current+" "+Integer.toString(count));
                sb.append(Integer.toString(count) + current);
                count = 1;
                current = c;
                index++;
            }
        }
        return sb.toString();
    }

    public String encode(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String output = "";
        char ichar;

        for (int i = 0; i < input.length(); i++) {
            ichar = input.charAt(i);
            if (map.containsKey(ichar)) {
                map.put(ichar, map.get(ichar) + 1);
            } else {
                map.put(ichar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            output += String.valueOf(entry.getValue()) + entry.getKey();
        }
        return output;
    }

    //4A3B2C1D2A =  10 = len
    public String decode(String input) {
        StringBuilder sb = new StringBuilder();
        char[] ichar = input.toCharArray();
        int len = ichar.length, i = 0, ct = 0;
        char schar;
        while (i <= len - 2) {
            ct = Integer.parseInt(String.valueOf(ichar[i]));
            // System.out.println(i+" "+"ct "+ct);
            schar = ichar[i + 1];
            for (int j = 0; j < ct; j++)
                sb.append(schar);
            i = i + 2;
            ct = 0;
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        String estr = new RunLength().charEncode("AAAABBBCCDAA");
        System.out.println("encoded " + estr);
        String destr = new RunLength().decode(estr);
        System.out.println("decoded " + destr);
    }


}