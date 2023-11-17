package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.objects.entities.IGameEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import org.bukkit.entity.Entity;

import javax.annotation.Nullable;

public interface IEntityManager {

    /**
     * Get a game entity from a minecraft entity
     * maybe cast to IGameLivingEntity, IEnemy or IAlly depending on the entity
     * @param entity
     * @return IGameEntity or null if not a game entity
     */
    @Nullable IGameEntity getGameEntity(Entity entity);
    IGameLivingEntity getGameLivingEntity(Entity entity);

}
