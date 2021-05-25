import java.awt.*;
import java.io.IOException;
import java.util.Scanner;


public class KangarooJump {




//    int i = 0;
//        do{
//            xv1 = x1 + (v1 * i);
//            xv2 = x2 + (v2 * i);
//            i++;
//            System.out.println("i = " + i);
//        } while (xv1 != xv2);

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean flag = false;
        int xv1 = 0, xv2 = 0;
        String op = null;
        for (int i = 1; i < 10000; i++) {
            xv1 = x1 + (v1 * i);
            xv2 = x2 + (v2 * i);
            System.out.println("xv1 = " + xv1+"  xv2 = " + xv2);
            if (xv1 == xv2){
//                System.out.println("in if "+i);
                flag = true;
                break;
            }
        }

        if (flag)
            op = "YES";
        else
            op = "NO";


        return op; // or NO
    }
    public static void main(String[] args) throws IOException {

//        String inp1 = new Scanner(System.in).nextLine();
//        String[] firstMultipleInput = inp1.split(" ");
        String[] firstMultipleInput = new Scanner(System.in).nextLine().split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);
        int v1 = Integer.parseInt(firstMultipleInput[1]);
        int x2 = Integer.parseInt(firstMultipleInput[2]);
        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);
    }

}
