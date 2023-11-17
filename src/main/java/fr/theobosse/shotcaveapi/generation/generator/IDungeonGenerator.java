package fr.theobosse.shotcaveapi.generation.generator;

import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.game.ILevel;
import fr.theobosse.shotcaveapi.generation.BossRoomInfo;
import fr.theobosse.shotcaveapi.generation.MazeInfo;
import fr.theobosse.shotcaveapi.generation.rooms.GenerationRoomType;
import fr.theobosse.shotcaveapi.generation.rooms.IRoom;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.util.Vector;
import org.joml.Vector2i;
import org.joml.Vector3i;

import java.util.Random;

public interface IDungeonGenerator {

    /////////////////////
    //     GETTERS     //
    /////////////////////

    Random getRandom();
    ILevel getLevel();

    String getGeneratorType();
    int getDungeonRooms();
    int getRoomSize();
    int getRoomHeight();
    int getMainWidth();
    int getMainRotationChance();
    int getBranchSpawnChance();
    int getBranchWidth();
    int getPathWidth(boolean isBranch);
    int getBranchRotationChance();
    int getBranchSize();
    int getTreasureSpawnChance();
    int getBranchDepth();
    boolean isBranchCollision();
    boolean isMainCollision();
    int getBossRoomSize();
    int getBossEntryOffset();


    /////////////////////////////
    //     IMPLEMENTATIONS     //
    /////////////////////////////

    MazeInfo generate(IGame game, int floor, Location location, int size, Vector3i start, Vector offset);
    void spawnRoom(IGame game, IRoom room, int rotation, Location loc, int roomPosX, int roomPosZ);
    void spawnRoom(IGame game, GenerationRoomType[][] maze, Location loc, int roomPosX, int roomPosZ);
    void spawnRoom(IGame game, IRoom room, int rotation, Location loc, int roomPosX, int roomPosZ, int roomSize);
    void spawnBossRoom(IGame game, BossRoomInfo bossRoomInfo, Location dungeonSpawnLoc, boolean open);
    void spawnWalls(GenerationRoomType[][] maze, Location loc, int i, int j);
    void spawnBarriers(GenerationRoomType[][] maze, Location loc, int i, int j, Material toReplace, Material material);

    void findNewDir(Vector2i mov);
    void findNewBranchDir(Vector2i mov);
    void rotateLeft(Vector2i mov);
    void rotateRight(Vector2i mov);
    void printMaze(GenerationRoomType[][] maze);

}
