package condiment;

public class Cheese extends Condiment {
    @Override
    public int cost() {
        return menu.cheese_Price;
    }
}