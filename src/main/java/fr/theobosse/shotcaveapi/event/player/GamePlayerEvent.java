package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.event.game.GameEvent;

public class GamePlayerEvent extends GameEvent {
    private final IGamePlayer gamePlayer;

    public GamePlayerEvent(IGamePlayer gamePlayer) {
        super(gamePlayer.getGame());
        this.gamePlayer = gamePlayer;
    }

    public IGamePlayer getGamePlayer() {
        return gamePlayer;
    }
}
