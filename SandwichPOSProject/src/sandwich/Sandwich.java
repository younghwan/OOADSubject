package sandwich;

import database.Menu;

public abstract class Sandwich {
	Menu menu = new Menu();
	public abstract int cost();
}
