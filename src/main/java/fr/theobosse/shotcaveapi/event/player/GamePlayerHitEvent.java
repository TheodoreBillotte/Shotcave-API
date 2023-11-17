package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.objects.weapons.IWeapon;
import org.bukkit.event.Cancellable;

public class GamePlayerHitEvent extends GamePlayerEvent implements Cancellable {

    private final IWeapon weapon;
    private boolean cancel = false;

    public GamePlayerHitEvent(IGamePlayer gamePlayer, IWeapon weapon) {
        super(gamePlayer);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
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
