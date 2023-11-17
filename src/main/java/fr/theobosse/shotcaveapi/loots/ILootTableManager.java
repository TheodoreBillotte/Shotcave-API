package fr.theobosse.shotcaveapi.loots;

import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public interface ILootTableManager {

    String getName();

    ArrayList<ItemStack> getRandomItems();
    ArrayList<ILootEntry> getLootEntries();
    IRandomLaw getRandomLaw();

    ArrayList<Item> dropRandomItems(Location location);
    ArrayList<Item> dropRandomItems(Location location, boolean showNametags);

}
