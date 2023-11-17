package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.objects.weapons.IGun;
import org.bukkit.event.Cancellable;

public class GamePlayerShootEvent extends GamePlayerEvent implements Cancellable {

    private final IGun gun;
    private boolean cancel = false;

    public GamePlayerShootEvent(IGamePlayer gamePlayer, IGun gun) {
        super(gamePlayer);
        this.gun = gun;
    }

    public IGun getGun() {
        return gun;
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
