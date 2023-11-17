package fr.theobosse.shotcaveapi.game;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public interface IGameStructure {
    ArrayList<ILevel> getLevels();

    IGameDifficulty getDifficulty();

    IGameEquipment getEquipments();

    String getName();

    boolean canRegen();

    @NotNull World getWorld();

    Location getLobby();

    int getDungeonSize();

    boolean isFriendlyFire();

    int getDungeonHeight();

    int getMobSpawnProtection();

    int getMaxWeapons();
}
