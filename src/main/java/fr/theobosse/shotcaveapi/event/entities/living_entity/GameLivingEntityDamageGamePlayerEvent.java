package fr.theobosse.shotcaveapi.event.entities.living_entity;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.event.Cancellable;

public class GameLivingEntityDamageGamePlayerEvent extends GameLivingEntityEvent implements Cancellable {
    private final IGamePlayer victim;
    private double damage;
    private boolean cancel = false;

    public GameLivingEntityDamageGamePlayerEvent(IGameLivingEntity gameLivingEntity, IGamePlayer victim, double damage) {
        super(gameLivingEntity);
        this.victim = victim;
        this.damage = damage;
    }

    public IGamePlayer getVictim() {
        return victim;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
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
