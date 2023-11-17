package fr.theobosse.shotcaveapi.generation;


import fr.theobosse.shotcaveapi.objects.entities.IMobConfig;

public record MobSpawn(IMobConfig enemy, int chance) {
}
