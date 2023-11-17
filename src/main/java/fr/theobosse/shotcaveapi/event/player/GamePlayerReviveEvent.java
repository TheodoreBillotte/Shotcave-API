package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;

public class GamePlayerReviveEvent extends GamePlayerEvent {
    private final IGamePlayer ally;

    public GamePlayerReviveEvent(IGamePlayer gamePlayer, IGamePlayer ally) {
        super(gamePlayer);
        this.ally = ally;
    }

    public IGamePlayer getAlly() {
        return ally;
    }
}
