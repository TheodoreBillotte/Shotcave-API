package fr.theobosse.shotcaveapi.loots;

import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public interface ILootEntry {

    ArrayList<Item> dropItems(Location location, boolean showNametags);
    ItemStack getItemStack();

    int getRandomAmount();
    int getMaxAmount();
    int getMinAmount();
    double getProbability();
    int getWeight();

}
