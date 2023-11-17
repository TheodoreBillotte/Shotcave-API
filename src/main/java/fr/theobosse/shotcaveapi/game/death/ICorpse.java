package fr.theobosse.shotcaveapi.game.death;

import org.bukkit.inventory.ItemStack;

public interface ICorpse {

    ItemStack[] getInventory();
    double getTimeLeftMillis();
    ICorpseRunnable getRunnable();

}
