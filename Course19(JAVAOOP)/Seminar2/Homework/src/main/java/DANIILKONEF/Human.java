package DANIILKONEF;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public Void setMakeOrder() {
        return null;
    }

    @Override
    public Void setTakeOrder() {
        return null;
    }

    @Override
    public Boolean isMakeOrder() {
        return Boolean.FALSE;
    }

    @Override
    public Boolean isTakeOrder() {
        return Boolean.FALSE;
    }

    @Override
    String getName() {
        return super.getName();
    }
}
