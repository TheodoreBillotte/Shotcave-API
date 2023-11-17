package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.event.enums.DamageReason;

public class GamePlayerKillGameLivingEntityEvent extends GamePlayerEvent {
    private final IGameLivingEntity gameLivingEntity;
    private final DamageReason reason;

    public GamePlayerKillGameLivingEntityEvent(IGamePlayer gamePlayer, IGameLivingEntity gameLivingEntity, DamageReason reason) {
        super(gamePlayer);
        this.gameLivingEntity = gameLivingEntity;
        this.reason = reason;
    }

    public IGameLivingEntity getGameLivingEntity() {
        return gameLivingEntity;
    }

    public DamageReason getReason() {
        return reason;
    }
}
