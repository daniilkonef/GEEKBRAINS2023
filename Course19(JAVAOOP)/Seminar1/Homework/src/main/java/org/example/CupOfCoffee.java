package org.example;

public class CupOfCoffee extends HotDrink{
    protected Double temperature;

    public CupOfCoffee(String name, Double cost, Double volume, Double temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }



    @Override
    public String toString() {
        return "CupOfCoffee{" +
                "volume=" + volume +
                ", temperature=" + temperature +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                "} " + super.toString();
    }
}
