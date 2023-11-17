package fr.theobosse.shotcaveapi.generation;

import fr.theobosse.shotcaveapi.objects.entities.IGameEntity;
import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.game.ILevel;
import fr.theobosse.shotcaveapi.generation.rooms.GenerationRoomType;
import org.bukkit.Location;

import javax.annotation.Nullable;

public interface INaturalSpawn {

    /////////////////////
    //     GETTERS     //
    /////////////////////

    ILevel getLevel();


    /////////////////////////////
    //     IMPLEMENTATIONS     //
    /////////////////////////////

    IGameEntity spawnMob(@Nullable IGame game, Location baseLoc, int floor, final GenerationRoomType roomType);
    void spawnMobs(IGame game, MazeInfo generation, Location loc);

}
