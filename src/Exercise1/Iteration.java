package Exercise1;

public class Iteration {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(operation(i,2, false));
		}
	}
	
	public static int operation(int num1, int num2, boolean check) {
		if(num1 == 0 && num2 != 0) {
			return num2;
		} else if(num2 == 0 && num1 != 0) {
			return num1;
		}
		
		if(check == true) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
}
