package fr.theobosse.shotcaveapi.generation.rooms;

import org.joml.Vector3i;

import java.util.HashMap;

public interface IRoom {

    String getName();
    RoomType getType();
    int getWeight();

    HashMap<Vector3i, RoomBlockData> getBlocks();

}
