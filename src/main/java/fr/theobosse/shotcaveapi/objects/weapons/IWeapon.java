package fr.theobosse.shotcaveapi.objects.weapons;

import fr.theobosse.shotcaveapi.objects.collectibles.ICollectible;
import fr.theobosse.shotcaveapi.chemistry.Element;
import fr.theobosse.shotcaveapi.chemistry.GameEffectParameters;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.function.Predicate;

public interface IWeapon extends ICollectible {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    ConfigurationSection getConfigSection();

    String getId();
    String getName();
    String getDescription();
    String getCategory();

    ArrayList<String> getLore();

    double getKnockback();
    double getAttackSpeed();
    double getSpeed();
    double getDamage();

    int getCooldown();

    Predicate<Entity> getHitCondition(LivingEntity attacker);
    ArrayList<Element> getElements();
    ArrayList<GameEffectParameters> getEffects();


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    ItemStack build();
    void initLore();
    void onMeleeAttack(@NotNull Player player, @Nullable Damageable attacked, double damage);
    double computeExtraDamage(LivingEntity attacker);
    void hit(LivingEntity damager, Damageable victim, Location hitLocation);
    void onHit(LivingEntity damager, Damageable victim, Location hitLocation);

}
