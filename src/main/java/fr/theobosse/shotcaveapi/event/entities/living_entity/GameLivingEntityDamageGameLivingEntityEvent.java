package fr.theobosse.shotcaveapi.event.entities.living_entity;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import org.bukkit.event.Cancellable;

public class GameLivingEntityDamageGameLivingEntityEvent extends GameLivingEntityEvent implements Cancellable {
    private final IGameLivingEntity victim;
    private boolean cancel = false;
    private double damage;

    public GameLivingEntityDamageGameLivingEntityEvent(IGameLivingEntity gameLivingEntity, IGameLivingEntity victim, double damage) {
        super(gameLivingEntity);
        this.victim = victim;
        this.damage = damage;
    }

    public IGameLivingEntity getVictim() {
        return victim;
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
