package condiment;

import sandwich.Sandwich;

public class Bacon extends Condiment {
	public Bacon(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
 
	public String getDescription() {
		return sandwich.getDescription() + " + Bacon";
	}
 
	public double cost() {
		return .20 + sandwich.cost();
	}
}
