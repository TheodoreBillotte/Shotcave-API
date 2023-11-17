package fr.theobosse.shotcaveapi.event.entities.living_entity;

import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;

public class GameLivingEntityChangeTargetEvent extends GameLivingEntityEvent implements Cancellable {

    private final Entity target;
    private boolean cancel;

    public GameLivingEntityChangeTargetEvent(IGameLivingEntity gameLivingEntity, Entity target) {
        super(gameLivingEntity);
        this.target = target;
    }

    public Entity getTarget() {
        return target;
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
