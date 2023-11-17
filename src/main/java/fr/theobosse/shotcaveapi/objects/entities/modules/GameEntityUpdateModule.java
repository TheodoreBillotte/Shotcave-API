package fr.theobosse.shotcaveapi.objects.entities.modules;

import fr.theobosse.shotcaveapi.objects.entities.IGameEntity;
import org.bukkit.configuration.ConfigurationSection;

public abstract class GameEntityUpdateModule extends GameEntityModule {
    public GameEntityUpdateModule(ConfigurationSection section) {
        super(section);
    }

    public void onUpdate(IGameEntity gameEntity) {}
}
