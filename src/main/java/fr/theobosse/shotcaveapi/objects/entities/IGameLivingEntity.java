package fr.theobosse.shotcaveapi.objects.entities;

import fr.theobosse.shotcaveapi.event.enums.DamageReason;
import fr.theobosse.shotcaveapi.loots.ILootTableManager;
import fr.theobosse.shotcaveapi.objects.ExtraDamageInfo;
import fr.theobosse.shotcaveapi.chemistry.Element;
import fr.theobosse.shotcaveapi.chemistry.GameEffect;
import fr.theobosse.shotcaveapi.objects.weapons.IWeapon;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public interface IGameLivingEntity extends IGameEntity {

    int getDamage();

    double getSpeed();
    double getMaxHealth();

    void applyEffect(GameEffect effect, int durationTicks);
    void updateEffects();
    boolean hasEffect(String effectID);
    void removeEffect(String effectId);
    void removeEffect(GameEffect effect);
    List<String> getEffectIds();
    List<GameEffect> getEffects();

    double getHealth();
    double getKnockback();

    boolean isShowHP();

    LivingEntity getLivingEntity();
    ILootTableManager getLootTableManager();

    void setBaseSpeed();
    void setSpeed(double speed);
    void setHealth(double health);
    void setShowHP(boolean showHP);

    void addHealth(double health);

    void subHealth(double health);

    boolean kill(@Nullable IGamePlayer gamePlayer, DamageReason reason);

    void damage(@Nullable Entity attacker, double amount, DamageReason reason);
    void damage(@Nullable Entity attacker, double amount, DamageReason reason, boolean isBonusDamage);
    void damage(@Nullable Entity attacker, double amount, DamageReason reason, Location damageLocation);
    void damage(@Nullable Entity attacker, double amount, DamageReason reason, Location damageLocation, IWeapon weapon);
    void damage(@Nullable Entity attacker, double amount, DamageReason reason, Location damageLocation, boolean isBonusDamage);
    void damage(@Nullable Entity attacker, double amount, DamageReason reason, Location damageLocation, IWeapon weapon, boolean isBonusDamage);

    HashSet<Element> getTotalElements();
    ArrayList<Element> getElements();
    boolean hasElement(Element element);
    boolean hasElement(String elementName);


    void forAllTotalElements(Consumer<Element> consumer);

    void knockback(@Nullable Entity attacker, double multiplier);


    ExtraDamageInfo computeExtraDamage(@Nullable Entity attacker, double amount, DamageReason reason, Location damageLocation);

    boolean isDamageInteractionLegal(@Nullable Entity attacker, @Nullable Location hitLocation);
    boolean isDamageInteractionLegal(@Nullable Entity attacker);

    void updateName();

    boolean checkHeadshot(Location hitLocation);

}
