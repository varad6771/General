import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class GenPrograms {

    public static double round(double val){
        BigDecimal bd = BigDecimal.valueOf(val);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public List<String> cashRegister(double cost, double paid) {
        List<String> op = new ArrayList<>();
        Map<Double, String> register = new HashMap<>();

        register.put(0.01, "PENNY");
        register.put(0.05, "NICKEL");
        register.put(0.10, "DIME");
        register.put(0.50, "CENT");
        register.put(1.0,"DOLLAR");
        register.put(5.0, "FIVE");
        register.put(10.0,"TEN");
        register.put(20.0,"TWENTY");


        double rem = round(Math.abs(paid - cost));
//        System.out.println("rem = " + rem);
        ArrayList<Double> keyList = new ArrayList<>(register.keySet());
        Collections.sort(keyList);
        int i = keyList.size()-1;

        while(i >= 0) {
//            System.out.println("val = " + keyList.get(i));
            if (rem >= keyList.get(i)) {
                rem = round(rem - keyList.get(i));
//                System.out.println("val = " + keyList.get(i) + " - " + register.get(keyList.get(i)) + " rem " + rem);
                op.add(register.get(keyList.get(i)));
                i--;
            } else if (rem == 0.0){
//                System.out.println("in elif");
                break;
            } else {
//                System.out.println("in else");
                i--;
            }
        }

        return op;
    }

    public void astPartPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void revAstPartPyramid(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 2 * (n - i); j >= 0; j--) {
                // printing spaces
                System.out.print(" ");
            }


            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void astPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void anagram(String inp1, String inp2) {

        char[] op1 = inp1.toLowerCase().toCharArray();
        char[] op2 = inp2.toLowerCase().toCharArray();
        Arrays.sort(op1);
        Arrays.sort(op2);
        System.out.println(new String(op1).equals(new String(op2)));
    }

    public void sumDiag(int[][] arr, int n) {
        int sum = 0, sum1 = 0;
        for (int i = 0; i < n; i++) {
            if (i == i) {
                sum += arr[i][i]; // no need to take j loop anyway i==j hence might as well be i==i
                sum1 += arr[i][n - i - 1]; // n=3 hence other diag - starts at 3-0-1 and ends at 3-2-1
                System.out.println((n - i - 1));
            }
        }
        System.out.println("Math.abs(sum-sum1) = " + Math.abs(sum - sum1));
    }

    public void sumDigits(int no) {
        String num = String.valueOf(no);
        int mul = 1;
        for (char cno : num.toCharArray()) {
            System.out.println("char = " + cno);
            mul *= Integer.parseInt(cno + "");
        }
        System.out.println("mul = " + mul);

    }

    public void replaceString(String neww) {
        String b = neww.replace("7", "");
        b = b.replace("56", "");
        System.out.println("new str = " + b);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> alist = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        String inp = sc.nextLine();
//        int n = sc.nextInt();
//        int arr[][] = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        new GenPrograms().replaceString(inp);
//        new GenPrograms().anagram("ate", "tea");
//        new GenPrograms().sumDigits(n);
//        new GenPrograms().sumDiag(arr, n);

//        new GenPrograms().revAstPartPyramid(n);
//        new GenPrograms().astPyramid(n);

        List<String> op = new GenPrograms().cashRegister(55, 54.94);
        for (String s : op) System.out.println(s);

    }
}