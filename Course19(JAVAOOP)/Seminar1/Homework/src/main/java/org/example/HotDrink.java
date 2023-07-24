package org.example;

public abstract class HotDrink extends Product {
    protected Double volume;
    protected Double temperature;

    public HotDrink(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotDrink)) return false;
        //if (!(o instanceof BottleOfWater that)) return false;

        HotDrink that = (HotDrink) o;
        return getVolume() != null ? getVolume().equals(that.getVolume()) : that.getVolume() == null;
    }


}
