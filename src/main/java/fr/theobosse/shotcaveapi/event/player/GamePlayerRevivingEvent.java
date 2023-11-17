package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;

public class GamePlayerRevivingEvent extends GamePlayerEvent {


    private final IGamePlayer ally;
    private final long remainingTime;

    public GamePlayerRevivingEvent(IGamePlayer gamePlayer, IGamePlayer ally, long remainingTime) {
        super(gamePlayer);
        this.ally = ally;
        this.remainingTime = remainingTime;
    }

    public IGamePlayer getAlly() {
        return ally;
    }

    public long getRemainingTime() {
        return remainingTime;
    }
}
