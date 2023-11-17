package fr.theobosse.shotcaveapi.objects;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface IArmor {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    String getName();
    String getId();
    List<String> getLore();

    double getDefense();
    double getDefenseToughness();
    double getBulletDamage();
    double getSummonLifeDuration();
    double getMeleeDamage();
    double getCooldownReduction();
    double getAttackSpeed();
    double getMaxHealth();
    double getSpeed();


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    ItemStack build();

}
