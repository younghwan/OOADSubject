package condiment;

import sandwich.Sandwich;

public class EggMayo extends Condiment {
	public EggMayo(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	public String getDescription() {
		return sandwich.getDescription() + " + EggMayo";
	}

	public double cost() {
		return .10 + sandwich.cost();
	}
}
