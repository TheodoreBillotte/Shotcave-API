package fr.theobosse.shotcaveapi.event.entities.living_entity;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.event.entities.GameEntityEvent;

public class GameLivingEntityEvent extends GameEntityEvent {
    private final IGameLivingEntity gameLivingEntity;

    public GameLivingEntityEvent(IGameLivingEntity gameLivingEntity) {
        super(gameLivingEntity);
        this.gameLivingEntity = gameLivingEntity;
    }

    public IGameLivingEntity getGameLivingEntity() {
        return gameLivingEntity;
    }
}
