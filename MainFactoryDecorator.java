package DecoratorPattern;

public class MainFactoryDecorator {
	public static void main(String[] args) {
		HamburgerFactory hamburgerfabriek = new HamburgerFactory();
		Hamburger vegaburger = hamburgerfabriek.CreateHamburger("VegaBurger");
		vegaburger.ProductGekozen();
		
		Hamburger burger = new SlaDecorator(vegaburger, 5); 
		burger.Kosten();
	}

}
