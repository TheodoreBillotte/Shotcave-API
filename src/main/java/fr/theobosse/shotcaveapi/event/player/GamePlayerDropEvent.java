package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.collectibles.ICollectible;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.entity.Item;
import org.bukkit.event.Cancellable;

public class GamePlayerDropEvent extends GamePlayerEvent implements Cancellable {
    private final ICollectible collectible;
    private final Item dropItem;
    private boolean cancel = false;

    public GamePlayerDropEvent(IGamePlayer gamePlayer, ICollectible collectible, Item dropItem) {
        super(gamePlayer);
        this.collectible = collectible;
        this.dropItem = dropItem;
    }

    public Item getDropItem() {
        return dropItem;
    }

    public ICollectible getCollectible() {
        return collectible;
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
