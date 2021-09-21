package DecoratorPattern;

public class VleesBurger extends Hamburger {
	public double Kosten() {
		return 2.50;
	}
	
	public void ProductGekozen() {
		System.out.println("U heeft een vleesburger gekozen.");
	}
}
