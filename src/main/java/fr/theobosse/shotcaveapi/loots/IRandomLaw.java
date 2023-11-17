package fr.theobosse.shotcaveapi.loots;

import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public interface IRandomLaw {


    ArrayList<ItemStack> getRandomItems(ArrayList<ILootEntry> lootEntries);

    ArrayList<Item> dropRandomItems(ArrayList<ILootEntry> lootEntries, Location location, boolean showNametags);

}
