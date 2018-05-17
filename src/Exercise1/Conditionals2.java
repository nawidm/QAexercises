package Exercise1;

public class Conditionals2 {
	public static void main(String[] args) {
		System.out.println(operation(3,0, false));
	}
	
	public static int operation(int num1, int num2, boolean check) {
		if(num1 == 0 && num2 != 0) {
			return num2;
		} else if(num2 == 0 && num1 != 0) {
			return num1;
		}
		
		if(check) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
}
