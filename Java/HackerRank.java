import java.util.HashMap;

public class HackerRank {

    public static String numberToWords(int num) {
        String opNum = "";
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");


        if (map.containsKey(num)) {
            opNum = map.get(num);
        } else {
            char[] cnum = String.valueOf(num).toCharArray();
//            System.out.println("cnum " + cnum[0] + cnum[1]);
            if (num > 20 && num < 30) {
                opNum = "twenty" + map.get(Integer.parseInt(cnum[1] + ""));
            } else if (num > 30 && num < 40) {
                opNum = "thirty" + map.get(Integer.parseInt(cnum[1] + ""));
            } else if (num > 40 && num < 50) {
                opNum = "forty" + map.get(Integer.parseInt(cnum[1] + ""));
            } else if (num > 50 && num < 60) {
                opNum = "fifty" + map.get(Integer.parseInt(cnum[1] + ""));
            }
        }
//        System.out.println("opNum = " + opNum);
        return opNum;
    }

    public String timeInWords(int h, int m) {
        String toPast;
        String minutes = "";
        String hours;
        String time;

        if (m == 0) {
            hours = numberToWords(h);
            time = hours + " O' clock";
        } else if (1 <= m && m <= 30) {

            if (m == 15) {
                minutes = "quarter ";
            } else if (m == 30) {
                minutes = "half ";
            } else if (m >= 10 && m != 15 && m != 30) {
                minutes = numberToWords(m) + " minutes ";
            } else if (m <= 9) {
                minutes = numberToWords(m) + " minute ";
            }

            hours = numberToWords(h);
            toPast = "past ";

            time = minutes + toPast + hours;
        } else {
            if (m == 45) {
                minutes = "quarter ";
            } else {
                minutes = numberToWords((60 - m)) + " minutes ";
            }

            // at 12 50 it will show 10 min to 13 so to make it 1 use this - nextHour = (hour % 12) + 1; (12%12) = 0+1
            h = h + 1;
            hours = numberToWords(h);
            toPast = "to ";
            time = minutes + toPast + hours;
        }

        return time;
    }

    public String encryption(String input) {
//        System.out.println("input.length() = " + input.length());
        int row = (int) Math.floor(Math.sqrt(input.length()));
        int col = (int) Math.ceil(Math.sqrt(input.length()));
        char[] inpCarr = input.toCharArray();
//        System.out.println("col " + col + " row " + row + " prod " + (row * col));
        if ((row * col) < input.length()) {
            row += 1;
        }
//        System.out.println("row1 = " + row);
        char[][] oparr = new char[row][col];

        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (k < input.length())
                    oparr[i][j] = inpCarr[k];
                else
                    oparr[i][j] = '$';

                k++;
            }
        }


        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
//                System.out.println("ij = [" + i + "," + j + "]");
                sb.append(oparr[j][i]);
            }
            sb.append(" ");
        }

        return sb.toString().replace("$", "");
    }


    public static void main(String[] args) {
        HackerRank hackerRank = new HackerRank();
//
//        int h = Integer.parseInt(new Scanner(System.in).nextLine());
//        int m = Integer.parseInt(new Scanner(System.in).nextLine());

//        String result = hackerRank.timeInWords(5, 45);
        // feedthedog  = fto ehg ee dd   chillout = clu hlt io
        String result = hackerRank.encryption("haveaniceday"); // hae and via ecy
//        String result = hackerRank.encryption("chillout"); // hae and via ecy
//        String result = hackerRank.encryption("iffactsdontfittotheorychangethefacts"); // isieae fdtonf fotrga anoyec cttctt tfhhhs
        System.out.println("result = " + result);

    }
}
