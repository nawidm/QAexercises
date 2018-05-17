package Exercise1;
import java.lang.Math;
public class IterationArrays2 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = (int) (Math.random()*100);
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] *= 10;
			System.out.println(numbers[i]);
		}
	}
}
