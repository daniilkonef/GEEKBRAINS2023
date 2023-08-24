public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return this.description;
    }


    @Override
    public Double getCost() {
        return 1.99;
    }

    public Espresso() { // constructor
        this.description = "Espresso Coffee";
    }




}
