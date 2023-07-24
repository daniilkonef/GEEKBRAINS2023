package org.example;

public class BottleOfWater extends Product{
    //private Integer volume;
    private Double volume;

    public BottleOfWater(String name, Double cost, Double volume) {
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
        return "BottleOfWater{" +
                "volume=" + volume +
                "} " + super.toString();
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
