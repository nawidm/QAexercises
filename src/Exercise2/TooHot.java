package Exercise2;

public class TooHot {
	public static void main(String[] args) {
		if(isItTooHot(190,true)) {
			System.out.println("It's fine");
		} else {
			System.out.println("It's too hot");
		}
	}
	
	public static boolean isItTooHot(int temperature, boolean isSummer) {
		if(isSummer) {
			if(temperature >= 60 && temperature <=100) {
				return true;
			} else {
				return false;
			}
		} else {
			if(temperature >= 60 && temperature <=90) {
				return true;
			} else {
				return false;
			}
		}

	}
}
