package fr.theobosse.shotcaveapi.game;

import fr.theobosse.shotcaveapi.objects.entities.IMobConfig;
import org.bukkit.Location;

public record PendingEnemy(IMobConfig enemy, Location location) { }
