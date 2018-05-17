package Exercise2;

public class TestPaintWizard {
	public static void main(String[] args) {
		PaintWizard pwiz = new PaintWizard(500);
		System.out.println(pwiz.getCheapest());
		System.out.println(pwiz.leastWaste());
	}
}
