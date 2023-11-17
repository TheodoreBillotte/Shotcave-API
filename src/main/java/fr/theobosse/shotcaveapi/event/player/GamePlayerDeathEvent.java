package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;

public class GamePlayerDeathEvent extends GamePlayerEvent {
    public GamePlayerDeathEvent(IGamePlayer gamePlayer) {
        super(gamePlayer);
    }
}
