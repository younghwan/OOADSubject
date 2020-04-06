package model;

import condiment.Condiment;
import sandwich.Sandwich;

import java.util.List;

public class Product {
    private Sandwich sandwich;
    private List<Condiment> condiments;
    private int totalPrice = 0;


    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public void setCondiments(List<Condiment> condiments) {
        this.condiments = condiments;
    }

    public int price() {
        this.totalPrice += sandwich.cost();
        for (Condiment condiment : condiments) {
            this.totalPrice += condiment.cost();
        }
        return this.totalPrice;
    }

}
