package fr.theobosse.shotcaveapi.generation.generator;

import fr.theobosse.shotcaveapi.generation.MazeInfo;
import fr.theobosse.shotcaveapi.generation.rooms.GenerationRoomType;
import org.joml.Vector3i;

import java.util.Random;

public abstract class Generator {

    protected final IDungeonGenerator generator;
    protected final Random random;


    /**
     * The constructor of the generator must take a DungeonGenerator as parameter:
     * public YourGenerator(DungeonGenerator generator);
     * @param generator The generator
     */
    public Generator(IDungeonGenerator generator) {
        this.generator = generator;
        this.random = generator.getRandom();
    }

    /**
     * Generates a level layout and returns the exit
     * @param maze The grid to write the maze on
     * @param start The start cell
     * @return The exit cell
     */
    public abstract MazeInfo generateMaze(GenerationRoomType[][] maze, Vector3i start);

}
