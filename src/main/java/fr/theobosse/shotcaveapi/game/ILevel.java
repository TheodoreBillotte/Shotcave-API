package fr.theobosse.shotcaveapi.game;

import fr.theobosse.shotcaveapi.generation.ILevelFloor;
import fr.theobosse.shotcaveapi.objects.entities.IMobConfig;
import fr.theobosse.shotcaveapi.generation.INaturalSpawn;
import fr.theobosse.shotcaveapi.generation.WallPattern;
import fr.theobosse.shotcaveapi.generation.generator.IDungeonGenerator;
import fr.theobosse.shotcaveapi.generation.rooms.IRoom;
import org.bukkit.Location;
import org.bukkit.Material;
import org.joml.Vector3i;

import java.util.List;
import java.util.Random;

public interface ILevel {

    /////////////////////
    //     GETTERS     //
    /////////////////////

    String getName();
    String getWorldNameId();
    String getWorldName();
    String getWorldLevelName();

    IDungeonGenerator getGenerator();
    INaturalSpawn getNaturalSpawn();
    List<IMobConfig> getBoss();
    Material[] getDungeonBlocks();
    List<IRoom>[] getRooms();
    WallPattern getWallPattern();

    List<ILevelFloor> getFloors();

    long getWorldTime();
    double getEndKillPercentage();


    /////////////////////////////
    //     IMPLEMENTATIONS     //
    /////////////////////////////

    Material getWallDungeonBlock(Vector3i globalPos, Vector3i relativePos, Random random);
    Material getWallDungeonBlock(Location loc, Vector3i pos, Random random);

}
