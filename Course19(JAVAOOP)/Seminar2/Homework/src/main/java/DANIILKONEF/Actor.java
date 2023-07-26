package DANIILKONEF;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected Boolean isMakeOrder; // если Тру, то клиента ожидает его заказ
    protected Boolean isTakeOrder;
     String getName() {
         return this.name;
     }

    public Actor(String name) {
        this.name = name;
    }
}

