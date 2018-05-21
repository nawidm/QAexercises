package Exercise2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UniqueSumTest {

	UniqueSum example = new UniqueSum();
	
	@Test
	public void additionTest() {
		assertEquals(12,example.getUniqueSum(3,4,5));
	}
	
	@Test
	public void SingleUniqueTest() {
		assertEquals(3,example.getUniqueSum(3, 4, 4));
	}
	
	@Test
	public void NoUniqueTest() {
		assertEquals(0,example.getUniqueSum(3, 3, 3));
	}
}
