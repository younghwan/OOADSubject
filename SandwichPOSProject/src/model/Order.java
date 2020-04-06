package model;

import condiment.*;
import sandwich.*;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Product product = new Product();
    Sandwich sandwich;
    List<Condiment> condiments = new ArrayList<>();

    public void orderSandwich(String sandwich) {

        System.out.println(sandwich);
        switch (sandwich) {
            case "BLTSandwich":
                this.sandwich = new BLTSandwich();
                break;
            case "ItalianBMT":
                this.sandwich = new ItalianBMT();
                break;
            case "MeatballSandwich":
                this.sandwich = new MeatballSandwich();
                break;
            case "HamSandwich":
                this.sandwich = new HamSandwich();
                break;
        }
        product.setSandwich(this.sandwich);

    }

    public void orderCondiments(List<String> condiments) {
        for (String condiment : condiments) {
            switch (condiment) {
                case "Bacon":
                    this.condiments.add(new Bacon());
                    break;
                case "Cheese":
                    this.condiments.add(new Cheese());
                    break;
                case "EggMayo":
                    this.condiments.add(new EggMayo());
                    break;
                case "Pepperoni":
                    this.condiments.add(new Pepperoni());
                    break;
            }
        }
        product.setCondiments(this.condiments);
    }

    public int getProductPrice() {
        return product.price();
    }
}
