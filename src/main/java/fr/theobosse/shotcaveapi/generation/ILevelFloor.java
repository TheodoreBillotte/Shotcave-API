package fr.theobosse.shotcaveapi.generation;

import java.util.ArrayList;

public interface ILevelFloor {

    ArrayList<MobSpawn> getMobs();
    int getTotalChance();
    int getMobSpawnChance();

}
