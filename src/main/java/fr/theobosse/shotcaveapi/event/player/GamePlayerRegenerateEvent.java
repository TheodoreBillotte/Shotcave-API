package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.collectibles.ICollectible;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;

public class GamePlayerRegenerateEvent extends GamePlayerEvent {
    private final ICollectible collectible;
    private final int amount;

    public GamePlayerRegenerateEvent(IGamePlayer gamePlayer, ICollectible collectible, int amount) {
        super(gamePlayer);
        this.collectible = collectible;
        this.amount = amount;
    }

    public ICollectible getCollectible() {
        return collectible;
    }

    public int getAmount() {
        return amount;
    }
}
