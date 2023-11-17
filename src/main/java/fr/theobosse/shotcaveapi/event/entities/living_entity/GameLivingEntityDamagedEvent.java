package fr.theobosse.shotcaveapi.event.entities.living_entity;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.event.enums.DamageReason;
import org.bukkit.event.Cancellable;

import javax.annotation.Nullable;

public class GameLivingEntityDamagedEvent extends GameLivingEntityEvent implements Cancellable {
    private final DamageReason reason;
    private final IGamePlayer gamePlayer;
    private final IGameLivingEntity livingEntity;
    private double damage;
    private boolean cancelled;

    public GameLivingEntityDamagedEvent(IGameLivingEntity gameLivingEntity, @Nullable IGamePlayer gamePlayer,
                                        @Nullable IGameLivingEntity livingEntity, DamageReason damageReason, double damage) {
        super(gameLivingEntity);
        this.reason = damageReason;
        this.damage = damage;
        this.gamePlayer = gamePlayer;
        this.livingEntity = livingEntity;
    }

    public DamageReason getReason() {
        return reason;
    }

    public double getDamage() {
        return damage;
    }

    @Nullable
    public IGamePlayer getGamePlayerDamager() {
        return gamePlayer;
    }

    @Nullable
    public IGameLivingEntity getLivingEntityDamager() {
        return livingEntity;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
