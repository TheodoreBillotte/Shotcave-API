package fr.theobosse.shotcaveapi.event.entities;

import fr.theobosse.shotcaveapi.objects.entities.IGameEntity;
import fr.theobosse.shotcaveapi.event.game.GameEvent;

public class GameEntityEvent extends GameEvent {
    private final IGameEntity gameEntity;

    public GameEntityEvent(IGameEntity gameEntity) {
        super(gameEntity.getGame());
        this.gameEntity = gameEntity;
    }

    public IGameEntity getGameEntity() {
        return gameEntity;
    }
}
