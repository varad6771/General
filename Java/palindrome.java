class palindrome {
    public static void main(String[] args) {
        int number = 121;
        int num = number;
        int rem = 0, rev = 0;

        while (num != 0) {
            rem = num % 10;
            System.out.println("rem = " + rem);
//            rev = rev * 10 + rem;
//            System.out.println("rev = " + rev);
            num = num / 10;
            System.out.println("num = " + num);
        }
//
//        if (rev == number)
//            System.out.println("yes");
//        else
//            System.out.println("no");


    }
}
