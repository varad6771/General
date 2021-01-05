public class GenPrograms {
	
	public void anagram(String inp1, String inp2){

		char []op1 = inp1.toLowerCase().toCharArray();
		char []op2 = inp2.toLowerCase().toCharArray();
		Arrays.sort(op1);
		Arrays.sort(op2);
		System.out.println(new String(op1).equals(new String(op2)));
	}

	public static void main(String[] args) {
		new GenPrograms().anagram("ate", "tea");
	}
}