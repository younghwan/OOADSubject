package condiment;


public class Pepperoni extends Condiment {
	@Override
	public int cost() {
		return menu.bacon_Price;
	}
}
