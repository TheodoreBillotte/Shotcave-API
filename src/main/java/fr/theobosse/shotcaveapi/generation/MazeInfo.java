package fr.theobosse.shotcaveapi.generation;

import fr.theobosse.shotcaveapi.generation.rooms.GenerationRoomType;
import org.bukkit.util.Vector;
import org.joml.Vector3i;

public record MazeInfo(Vector3i exit, Vector3i entrance, int treasures, boolean[][] traveledMap, GenerationRoomType[][] maze, Vector offset, BossRoomInfo bossRoomInfo) {
}
