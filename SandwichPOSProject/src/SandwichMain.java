import condiment.Bacon;
import condiment.Cheese;
import condiment.Pepperoni;
import sandwich.HamSandwich;
import sandwich.ItalianBMT;
import sandwich.MeatballSandwich;
import sandwich.Sandwich;

public class SandwichMain {
 
	public static void main(String args[]) {
		Sandwich sandwich = new ItalianBMT();
		System.out.println(sandwich.getDescription()
				+ " ₩" + sandwich.cost());
 
		Sandwich sandwich2 = new HamSandwich();
		sandwich2 = new Bacon(sandwich2);
		sandwich2 = new Bacon(sandwich2);
		sandwich2 = new Cheese(sandwich2);

		System.out.println(sandwich2.getDescription()
				+ " ₩" + sandwich2.cost());
 
		Sandwich sandwich3 = new MeatballSandwich();
		sandwich3 = new Pepperoni(sandwich3);
		sandwich3 = new Bacon(sandwich3);
		sandwich3 = new Cheese(sandwich3);
		System.out.println(sandwich3.getDescription()
				+ " ₩" + sandwich3.cost());

		//객체 생성해서 계산하는 controller 만들기

	}
}
