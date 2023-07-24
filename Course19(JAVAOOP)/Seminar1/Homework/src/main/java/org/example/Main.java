package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Fanta",99.0,0.95);
        Product bottle2 = new BottleOfWater("Fanta",150.0,1.95);
        Product bottle3 = new BottleOfWater("Cola",99.0,0.95);
        Product bottle4 = new BottleOfWater("Cola",150.0,1.95);
        //System.out.println(new BottleOfWater("Cola", 1.0, 2.0));


        List<Product> assortment = new ArrayList<>();
        assortment.add(bottle1);
        assortment.add(bottle2);
        assortment.add(bottle3);
        assortment.add(bottle4);

        VendingMachine drinkMachine = new DrinkMachine(assortment);
    }
}