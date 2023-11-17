package fr.theobosse.shotcaveapi.objects.weapons;

import fr.theobosse.shotcaveapi.objects.sounds.ISoundPlayer;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public interface IGun extends IWeapon {

    /////////////////////
    //     GETTERS     //
    /////////////////////

    int getMaxAmmo();
    int getAmmoPerShot();
    int getBurstCount();
    int getBurstDelay();

    double getSpread();

    ISoundPlayer getShootSound();
    ISoundPlayer getNoAmmoSound();


    /////////////////////////////
    //     IMPLEMENTATIONS     //
    /////////////////////////////

    boolean shoot(LivingEntity shooter);
    void shootBullet(LivingEntity shooter, Vector direction);
    void playShootSound(Location location, ItemStack itemStack);
    void update(ItemStack itemStack);

}
