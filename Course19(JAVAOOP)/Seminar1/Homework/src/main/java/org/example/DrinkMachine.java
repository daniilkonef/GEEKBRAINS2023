package org.example;

import java.util.List;


public class DrinkMachine implements VendingMachine { // https://translate.google.ru/?hl=ru&tab=TT&sl=ru&tl=en&text=%D1%82%D0%BE%D1%80%D0%B3%D0%BE%D0%B2%D1%8B%D0%B9%20%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0%D1%82%20%D1%82%D0%BE%D1%80%D0%B3%D1%83%D1%8E%D1%83%D1%89%D0%B8%D0%B9%20%D0%B1%D1%83%D1%82%D1%8B%D0%BB%D0%BA%D0%B0%D0%BC%D0%B8%20%D0%B2%D0%BE%D0%B4%D1%8B&op=translate
    private List<Product> products;
    private List<Product> vendingProducts;


    public DrinkMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
