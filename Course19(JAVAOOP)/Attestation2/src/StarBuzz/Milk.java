public class Milk extends Condiment {

    Beverage link;

    @Override
    public String getDescription() {
        return ((Beverage)link).getDescription() + " and " + this.getClass().getSimpleName();
    }


    @Override
    public Double getCost() {
        return null;
    }




    /*constructor*/ public Milk(Beverage link) {
        this.link = (Beverage)link;
    }



}
