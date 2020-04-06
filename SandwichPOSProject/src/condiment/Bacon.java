package condiment;

public class Bacon extends Condiment {
	@Override
	public int cost() {
		return menu.bacon_Price;
	}
}
