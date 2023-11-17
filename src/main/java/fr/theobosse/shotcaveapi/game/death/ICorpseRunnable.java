package fr.theobosse.shotcaveapi.game.death;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.entity.ArmorStand;
import org.bukkit.inventory.ItemStack;

public interface ICorpseRunnable {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    double getTimeLeftMillis();
    ArmorStand getArmorStand();
    ArmorStand getProgressBar();
    ItemStack[] getInventory();


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    void revivePlayer(IGamePlayer reviver);
    void stop();
    void run();

}
