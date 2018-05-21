package Exercise2;
import static org.junit.Assert.*;

import org.junit.Test;

public class TooHotTest {
	TooHot example = new TooHot();
	
	@Test
	public void testWithSummer() {
		assertEquals(true, example.isItTooHot(60,true));
		assertEquals(true, example.isItTooHot(100,true));
		assertEquals(true, example.isItTooHot(80,true));
	}
	
	public void testWithoutSummer() {
		assertEquals(true, example.isItTooHot(60,false));
		assertEquals(false, example.isItTooHot(100,false));
		assertEquals(true, example.isItTooHot(80,false));
	}
}
