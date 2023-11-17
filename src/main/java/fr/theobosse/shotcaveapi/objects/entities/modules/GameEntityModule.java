package fr.theobosse.shotcaveapi.objects.entities.modules;

import fr.theobosse.shotcaveapi.event.entities.GameEntitySpawnEvent;
import fr.theobosse.shotcaveapi.event.entities.living_entity.*;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public abstract class GameEntityModule {

    private final ConfigurationSection section;

    public GameEntityModule(ConfigurationSection section) {
        this.section = section;
    }

      ///////////////////////////
     //     ENTITY EVENTS     //
    ///////////////////////////
    public void onSpawn(GameEntitySpawnEvent event) {}
    public void onDeath(GameLivingEntityDeathEvent event) {}
    public void onDamaged(GameLivingEntityDamagedEvent event) {}
    public void onTargetChanged(GameLivingEntityChangeTargetEvent event) {}
    public void onDamagingGamePlayer(GameLivingEntityDamageGamePlayerEvent event) {}
    public void onDamagingGameLivingEntity(GameLivingEntityDamageGameLivingEntityEvent event) {}

      ///////////////////////////
     //     GETTER/SETTER     //
    ///////////////////////////

    public Entity getSpawnedEntity(EntityType type, Location location) { return null; }

    public ConfigurationSection getSection() {
        return section;
    }

       //////////////////////////////
     //     ABSTRACT METHODS     //
    /////////////////////////////

    abstract public void onLoad();
}
