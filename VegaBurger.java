package DecoratorPattern;

public class VegaBurger extends Hamburger {
	
	
	public double Kosten() {
		return 3.00;
	}
	
	public void ProductGekozen() {
		System.out.println("U heeft een VegaBurger gekozen.");
	}
	
	
}
