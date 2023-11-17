package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.event.enums.DamageReason;
import org.bukkit.event.Cancellable;

public class GamePlayerDamageGameEntityEvent extends GamePlayerEvent implements Cancellable {
    private final DamageReason reason;
    private final IGameLivingEntity victim;
    private final double damage;
    private boolean cancel;

    public GamePlayerDamageGameEntityEvent(IGamePlayer gamePlayer, DamageReason reason, IGameLivingEntity victim, double damage) {
        super(gamePlayer);
        this.reason = reason;
        this.victim = victim;
        this.damage = damage;
    }

    public DamageReason getReason() {
        return reason;
    }

    public double getDamage() {
        return damage;
    }

    public IGameLivingEntity getVictim() {
        return victim;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
