package org.example;

public class HotDrink extends Product {
    private Integer volume;
    private Integer temperature;

    public HotDrink(String name, Double cost, Integer volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
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

        HotDrink that = (HotDrink)o;
        return getVolume() != null ? getVolume().equals(that.getVolume()) : that.getVolume() == null;
    }


}
