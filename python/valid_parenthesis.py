def check_parenthesis(istring):
	stack = list()

	for char in istring:
	    if char in ['{', '(', '[']: 
	        stack.append(char)
	    else:
	        if not stack: 
	            return False
	        current_char = stack.pop()			
	        if current_char == '(' and char != ")": 
	            return False
	        if current_char == '{' and char != "}": 
	            return False
	        if current_char == '[' and char != "]": 
	            return False
	if stack: 
	    return "false"
	else:
	    return "true"

if __name__ == "__main__":
	input_string = "["
	print (check_parenthesis(input_string))
