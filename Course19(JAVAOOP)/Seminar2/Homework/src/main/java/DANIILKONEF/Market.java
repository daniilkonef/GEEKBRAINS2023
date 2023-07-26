package DANIILKONEF;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior{
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public Void takeInQueue(Actor actor) {
        System.out.println("Пришел в очередь: " + actor.getName());
        this.queue.add(actor);
        return null;
    }

    @Override
    public Void takeOrders() {
        for (Actor actor: queue) {
            if (!actor.isMakeOrder() ) { // если заказ не был исполнен то
                actor.setMakeOrder(Boolean.TRUE);
                System.out.println(actor.getName() + " сделал свой заказ.");
            }
        }
        return null;
    }

    @Override
    public Void giveOrders() {
        for (Actor actor: queue) {
            if (actor.isMakeOrder() ) { // если заказ уже исполнен то
                actor.setTakeOrder(Boolean.TRUE);
                System.out.println(actor.getName() + " получил свой заказ.");
            }
        }
        return null;
    }

    @Override
    public Void releaseFromQueue() {
        List<Actor> listActorsToBeReleased = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder) {
                listActorsToBeReleased.add(actor);
                System.out.println(actor.getName() + " вышел из очереди.");
            }
        }
        releaseFromMarket(listActorsToBeReleased);
        return null;
    }

    @Override
    public Void acceptToMarket(Actor actor) {
        /*call*/ System.out.println(actor.getName() + " пришёл в магазин.");
        /*call*/ takeInQueue(actor);
        return null;
    }

    @Override
    public Void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println(actor.getName() + "вышел из очереди и магазина.");
            queue.remove(actor);
        }
        return null;
    }

    @Override
    public Void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
        return null;
    }
}
