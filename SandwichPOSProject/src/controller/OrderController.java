package controller;

import model.Order;

import java.util.List;

public class OrderController {
    private Order order;
    public OrderController(Order order){
        this.order = order;
    }

    public void orderSandwich(String sandwich){
        order.orderSandwich(sandwich);
    }

    public void orderCondiments(List<String> condiments){
        order.orderCondiments(condiments);
    }

    public int getProductPrice(){
        return order.getProductPrice();
    }


}
