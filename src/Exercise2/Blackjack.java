package Exercise2;

public class Blackjack {
	public static void main(String[] args) {
		System.out.println(getClosestTo21(30,31));
	}
	
	public static int getClosestTo21(int num1, int num2) {
		if(num1 > 21 && num2 > 21) {
			return 0;
		} else if(num1 > 21) {
			return num2;
		} else if(num2 > 21) {
			return num1;
		} else {
			if(num1 > num2) {
				return num1;
			} else {
				return num2;
			}
		}
	}
}
