package DecoratorPattern;

public class SlaDecorator extends Hamburger {
	protected Hamburger hamburger;
	protected int aantal;
	
	public SlaDecorator(Hamburger hamburger, int aantal) {
		this.hamburger = hamburger;
		this.aantal = aantal;
	}
	
	public double Kosten() {
		System.out.println("De kosten zijn: " + (hamburger.Kosten() + 0.25));
		return (hamburger.Kosten() + 0.25);
	}
	
	public void ProductGekozen() {
		System.out.println( " SLA");
	}
	
	
	
	
	
	
}
