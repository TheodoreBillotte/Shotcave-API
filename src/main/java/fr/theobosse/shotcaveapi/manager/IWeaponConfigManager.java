package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.objects.IDataContainer;
import fr.theobosse.shotcaveapi.objects.weapons.IWeapon;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;

public interface IWeaponConfigManager {

    boolean isWeapon(ItemStack itemStack);
    @Nullable
    IWeapon getWeapon(String id);
    @Nullable
    IWeapon getWeapon(LivingEntity entity);
    @Nullable
    IWeapon getWeapon(ItemStack itemStack);
    @Nullable
    IDataContainer getWeaponData(LivingEntity shooter);
    @Nullable
    IDataContainer getWeaponData(ItemStack itemStack);

}
