import database.Menu;
import model.Order;
import controller.OrderController;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class SandwichMain {
 
	public static void main(String args[]) {
		Menu menu = new Menu();
		List<Product> productList = new ArrayList<>();
		Product product;
		Order order = new Order();
		List<String> condiments = new ArrayList<>();
		OrderController orderController = new OrderController(order);

		orderController.orderSandwich("BLTSandwich");

		condiments.add("Cheese");
		condiments.add("Bacon");

		orderController.orderCondiments(condiments);

		System.out.println(orderController.getProductPrice());

	}
}
