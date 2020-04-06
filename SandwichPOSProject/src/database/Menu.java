package database;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Menu {

    public int BLT_SANDWICH_PRICE;
    public int HAM_SANDWICH_PRICE;
    public int ITALIAN_SANDWICH_PRICE;
    public int MEATBALL_SANDWICH_PRICE;

    public int bacon_Price;
    public int cheese_Price;
    public int eggMayo_Price;
    public int pepperoni_Price;

    public Menu() {
        JSONParser jsonParse = new JSONParser();
        String path = System.getProperty("user.dir");
        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) jsonParse.parse(new FileReader(path + "/src/database/input.json"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        assert jsonObject != null;
        bacon_Price = Integer.parseInt(jsonObject.get("Bacon").toString());
        cheese_Price = Integer.parseInt(jsonObject.get("Cheese").toString());
        eggMayo_Price = Integer.parseInt(jsonObject.get("EggMayo").toString());
        pepperoni_Price = Integer.parseInt(jsonObject.get("Pepperoni").toString());

        BLT_SANDWICH_PRICE = Integer.parseInt(jsonObject.get("BLT").toString());
        HAM_SANDWICH_PRICE = Integer.parseInt(jsonObject.get("HamSandwich").toString());
        ITALIAN_SANDWICH_PRICE = Integer.parseInt(jsonObject.get("italianBMT").toString());
        MEATBALL_SANDWICH_PRICE = Integer.parseInt(jsonObject.get("MeatballSandwich").toString());
    }

}
