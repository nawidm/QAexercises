package Exercise1;

public class Arrays {
	
	public static void main(String[] args) {
		int[] numbers = {4,6,2,6,7,9,1,5,11,10};
		for(int i=0;i<9;i++) {
			System.out.println(operation(numbers[i], numbers[i+1], false));
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
