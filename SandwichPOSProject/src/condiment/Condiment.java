package condiment;

import database.Menu;

public abstract class Condiment{
	Menu menu = new Menu();
	public abstract int cost();
}
