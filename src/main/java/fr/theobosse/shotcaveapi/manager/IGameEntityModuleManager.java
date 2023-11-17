package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.objects.entities.modules.GameEntityModule;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;

public interface IGameEntityModuleManager {

    List<String> getModuleNames();
    GameEntityModule getModule(String name, ConfigurationSection config);
    boolean hasModule(String name);

    void addModule(String name, Class<? extends GameEntityModule> module);
    void removeModule(String name);
}
