public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return this.description;
    }


    @Override
    public Double getCost() {
        return 2.99;
    }

    public DarkRoast() { // constructor
        this.description = "Dark Roast Coffee";
    }




}
