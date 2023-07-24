package org.example;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Fanta",99.0,0.95);
        Product bottle2 = new BottleOfWater("Fanta",150.0,1.95);
        Product bottle3 = new BottleOfWater("Cola",99.0,0.95);
        Product bottle4 = new BottleOfWater("Cola",150.0,1.95);
        Product coffee1 = new CupOfCoffee("JavaEspresso",150.0,0.2);
        Product coffee2 = new CupOfCoffee("JavaAmericano",250.0,0.5);
        System.out.println(new BottleOfWater("Cola", 1.0, 2.0));


        List<Product> assortment = new ArrayList<>();
        assortment.add(bottle1);
        assortment.add(bottle2);
        assortment.add(bottle3);
        assortment.add(bottle4);
        assortment.add(coffee1);
        assortment.add(coffee2);

        VendingMachine drinkMachine = new DrinkMachine(assortment);
    }
}