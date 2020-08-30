class palindrome {
	public static void main(String[] args) {
		int number = 121;
		int num = number;
		int rem = 0, rev=0;

		while (num != 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (rev == number) 
			System.out.println("yes");
		else
			System.out.println("no");
		

	}
}
