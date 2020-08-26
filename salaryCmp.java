/**
You have records of employee name as string (Ename) and salary as positive integer (S). You have to sort the records on the basis of employee salary, if salary is same then use employee name for comparison.

Input:
The first line consists of a number T denoting the number of test cases. Each test case

will consist of a integer N denoting number of employees followed by the name and salary of the employee with spaces.

Output:
Each test case consists of a single line. It consists of the name and salary of the employees with spaces.

Constraints:
1 <= T <= 200
1 <= N <= 1000
1 <= Ename <= 106
1 <= S <= 106

Example:
Input:
2
2
xbnnskd 100 geek 50
2
shyam 50 ram 50
Output:
geek 50 xbnnskd 100
ram 50 shyam 50

Explanation:
Testcase 1: geek has lowest salary as 50 and xbnnskd has more salary. So sorted output is as given in sample.
*/


class salaryCmp {
	
	public void compare() {

	}

	public static void main(String[] args) {
		String ip = new Scanner().readLine();

		int num = 




		new salaryCmp().compare();
	}
}


class employee {

	int sal;
	String name;

	public employee(int sal, String name) {
		this.sal = sal;
		this.name = name;
	}

	public int getSal(){
		return sal;
	}

	public String getName(){
		return name;
	}


}