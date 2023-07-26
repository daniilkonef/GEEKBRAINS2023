package DANIILKONEF;

import java.util.List;

public interface MarketBehavior {
    public Void acceptToMarket(Actor a);
    public Void releaseFromMarket(List<Actor> actors);
    public Void update();
}
