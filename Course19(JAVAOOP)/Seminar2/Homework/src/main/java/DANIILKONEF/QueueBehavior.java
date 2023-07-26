package DANIILKONEF;

public interface QueueBehavior {
    Void takeInQueue(Actor a);
    Void takeOrders();
    Void giveOrders();
    Void releaseFromQueue();


}
