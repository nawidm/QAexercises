package Exercise1;

public class Conditionals {
	public static void main(String[] args) {
		System.out.println(operation(3,5, false));
	}
	
	public static int operation(int num1, int num2, boolean check) {
		if(check) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
}
