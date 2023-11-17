package fr.theobosse.shotcaveapi.game;

import fr.theobosse.shotcaveapi.loots.ILootTableManager;
import org.bukkit.Location;

public record PendingShopDisplay(Location location, ILootTableManager lootTable, int price) { }
