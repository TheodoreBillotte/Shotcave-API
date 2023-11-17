package fr.theobosse.shotcaveapi.event.entities.living_entity;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.event.enums.DamageReason;

import javax.annotation.Nullable;

public class GameLivingEntityDeathEvent extends GameLivingEntityEvent {


    private final IGamePlayer killer;
    private final DamageReason reason;

    public GameLivingEntityDeathEvent(IGameLivingEntity gameLivingEntity, @Nullable IGamePlayer killer, DamageReason reason) {
        super(gameLivingEntity);
        this.killer = killer;
        this.reason = reason;
    }

    @Nullable
    public IGamePlayer getKiller() {
        return killer;
    }

    public DamageReason getReason() {
        return reason;
    }
}
