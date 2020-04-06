package condiment;

import sandwich.Sandwich;

public class Cheese extends Condiment {
    public Cheese(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + " + Cheese";
    }

    public double cost() { return .10 + sandwich.cost(); }
}


