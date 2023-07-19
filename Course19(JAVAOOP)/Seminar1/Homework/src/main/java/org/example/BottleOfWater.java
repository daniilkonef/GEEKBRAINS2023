package org.example;

public class BottleOfWater extends Product{
    private Integer volume;

    public BottleOfWater(String name, Double cost, Integer volume) {
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
        return "BottleOfWater{" +
                "volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BottleOfWater)) return false;
        //if (!(o instanceof BottleOfWater that)) return false;

        BottleOfWater that = (BottleOfWater)o;
        return getVolume() != null ? getVolume().equals(that.getVolume()) : that.getVolume() == null;
    }


}
