package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.collectibles.ICollectible;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.event.Cancellable;

public class GamePlayerPickUpCollectibleEvent extends GamePlayerEvent implements Cancellable {
    private boolean cancel;

    public GamePlayerPickUpCollectibleEvent(IGamePlayer gamePlayer, ICollectible collectible, int amount) {
        super(gamePlayer);
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
