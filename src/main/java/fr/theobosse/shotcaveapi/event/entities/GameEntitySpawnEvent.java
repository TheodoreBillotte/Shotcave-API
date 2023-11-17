package fr.theobosse.shotcaveapi.event.entities;

import fr.theobosse.shotcaveapi.objects.entities.IGameEntity;

public class GameEntitySpawnEvent extends GameEntityEvent {
    public GameEntitySpawnEvent(IGameEntity gameEntity) {
        super(gameEntity);
    }
}
