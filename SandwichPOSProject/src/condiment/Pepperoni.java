package condiment;

import sandwich.Sandwich;

public class Pepperoni extends Condiment {
	public Pepperoni(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	public String getDescription() {
		return sandwich.getDescription() + " + Pepperoni";
	}

	public double cost() {
		return .15 + sandwich.cost();
	}
}
