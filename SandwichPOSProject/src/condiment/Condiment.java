package condiment;

import sandwich.Sandwich;

public abstract class Condiment extends Sandwich {
	Sandwich sandwich;
	public abstract String getDescription();
}
