package Exercise2;
import static org.junit.Assert.*;

public class PersonJUnitTest {
	
	public void test() {
		
		Person p = new Person("Nawid", 23, "Trainee");
		assertEquals("Nawid", p.getName());
		assertEquals(23, p.getAge());
		assertEquals("Trainee", p.getJobTitle());
		assertEquals("Nawid 23 Trainee", p.toString());
	}
}
