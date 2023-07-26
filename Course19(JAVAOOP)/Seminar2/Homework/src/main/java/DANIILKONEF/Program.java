package DANIILKONEF;

public class Program {

    public static void main(String[] args) {
        Market dixyMarket = new Market();
        Human human1 = new Human("Даниил");
        Human human2 = new Human("Влад");

        dixyMarket.acceptToMarket(human1);
        dixyMarket.acceptToMarket(human2);

        dixyMarket.update();

    }
}