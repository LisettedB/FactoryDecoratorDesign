package DecoratorPattern;



public class HamburgerFactory {
	public Hamburger CreateHamburger(String type) {
		switch(type) {
			case "VegaBurger":
				return new VegaBurger();				
			case "VleesBurger":
				return new VleesBurger();
		}
		return null;
	}


}
