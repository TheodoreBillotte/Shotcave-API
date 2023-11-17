package fr.theobosse.shotcaveapi.generation.rooms;

import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.game.ILevel;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.joml.Vector3i;

public interface IRoomBlock {

    String getNamespace();

    void spawnBlock(IGame game, ILevel level, Location loc, String data, Vector3i pos);

    String getData(Block block);

}
