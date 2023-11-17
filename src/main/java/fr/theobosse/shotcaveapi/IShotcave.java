package fr.theobosse.shotcaveapi;

import fr.theobosse.shotcaveapi.generation.generator.Generator;
import fr.theobosse.shotcaveapi.generation.rooms.IRoomBlock;
import fr.theobosse.shotcaveapi.manager.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;

public interface IShotcave extends Plugin {
    void registerNewCommand(String name, CommandExecutor executor);
    void addGenerator(String name, Class<? extends Generator> generator);
    void registerRoomBlock(IRoomBlock roomBlock);

    IChemistryManager getChemistryManager();
    IEntityManager getEntityManager();
    IGameEntityModuleManager getGameEntityModuleManager();
    IGameManager getGameManager();
    IGeneratorManager getGeneratorManager();
    IMobConfigManager getMobConfigManager();
    IRoomBlockManager getRoomBlockManager();
    IWeaponConfigManager getWeaponConfigManager();
}
