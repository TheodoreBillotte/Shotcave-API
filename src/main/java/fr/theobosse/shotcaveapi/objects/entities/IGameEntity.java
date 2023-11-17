package fr.theobosse.shotcaveapi.objects.entities;

import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.objects.IDataContainer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public interface IGameEntity {

    String getName();
    String getId();
    String getPassengerId();

    IDataContainer getDataContainer();
    EntityType getEntityType();
    IMobConfig getMobConfig();
    Entity getEntity();
    IGame getGame();

    boolean isHeadshottable();
    boolean isInvisible();
    boolean isEnemy();
    boolean isAlly();
    boolean isBoss();
    boolean isAlive();
    boolean isImportant();

    void remove();
}
