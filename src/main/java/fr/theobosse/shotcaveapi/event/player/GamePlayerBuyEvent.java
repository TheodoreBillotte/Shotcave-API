package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.entity.Item;
import org.bukkit.event.Cancellable;

public class GamePlayerBuyEvent extends GamePlayerEvent implements Cancellable {
    private final Item buyingItem;
    private final int price;
    private boolean cancel = false;

    public GamePlayerBuyEvent(IGamePlayer gamePlayer, Item buyingItem, int price) {
        super(gamePlayer);
        this.buyingItem = buyingItem;
        this.price = price;
    }

    public Item getBuyingItem() {
        return buyingItem;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
