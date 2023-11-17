package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.event.Cancellable;

public class GamePlayerDamagedByGameLivingEntityEvent extends GamePlayerEvent implements Cancellable {
    private final IGameLivingEntity damager;
    private final double damage;
    private boolean cancel;

    public GamePlayerDamagedByGameLivingEntityEvent(IGamePlayer gamePlayer, IGameLivingEntity damager, double damage) {
        super(gamePlayer);
        this.damager = damager;
        this.damage = damage;
    }

    public IGameLivingEntity getDamager() {
        return damager;
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
}
