import java.util.*; 
  
public class ValidBracket {


	public static boolean checkValidity(String input){
		char ichar, schar;
		Deque<Character> stack = new ArrayDeque<Character>();
		if (input.length() == 0 || input.length() == 1 ) {
			System.out.println("unbalanced");
		} else {
			for (int i = 0; i < input.length(); i++){
				ichar = input.charAt(i);

				if (ichar == '(' || ichar == '[' || ichar == '{') {
					stack.push(ichar);
				} else {

					 if (stack.isEmpty()) 
                		return false; 	

					schar = stack.pop();
					if (schar == ')' && ichar != '(') {
						return false;
					} else if (schar == '}' && ichar != '{' ) {
						return false;
					} else if (schar == ']' && ichar != '[') {
						return false;
					}
				}
			}

		}

		return (stack.isEmpty());
	}

	public static void main(String [] args){
		String input = "()[]{([{}])}";
		System.out.println();
		if(checkValidity(input))
			System.out.println("balanced");
		else
			System.out.println("not balanced");
	}



}