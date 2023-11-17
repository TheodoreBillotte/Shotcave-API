package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;

public class GamePlayerOpenDoorEvent extends GamePlayerEvent {
    public GamePlayerOpenDoorEvent(IGamePlayer gamePlayer) {
        super(gamePlayer);
    }
}
