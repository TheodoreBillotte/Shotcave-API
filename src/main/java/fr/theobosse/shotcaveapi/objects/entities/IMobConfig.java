package fr.theobosse.shotcaveapi.objects.entities;

import fr.theobosse.shotcaveapi.objects.entities.modules.GameEntityModule;
import fr.theobosse.shotcaveapi.objects.entities.modules.GameEntityUpdateModule;
import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.loots.ILootTableManager;
import fr.theobosse.shotcaveapi.chemistry.Element;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

import java.util.ArrayList;

public interface IMobConfig {

    String getId();
    String getName();
    String getPassengerId();

    double getSpeed();
    double getMaxHealth();
    double getKnockback();
    double getRange();
    double getHeadSize();

    int getDamage();

    boolean isEnemy();
    boolean isBaby();
    boolean isHeadshottable();
    boolean isInvisible();
    boolean requiresHeadshot();
    boolean isShowHP();
    boolean isInvulnerable();
    boolean isFireType();
    boolean isSilent();

    ArrayList<Element> getElements();

    ArrayList<GameEntityModule> getModules();
    ArrayList<GameEntityUpdateModule> getUpdateModules();
    boolean hasModule(Class<? extends GameEntityModule> moduleClass);

    void addModule(GameEntityModule module);
    void addUpdateModule(GameEntityModule module);
    void loadModule(Class<? extends GameEntityModule> moduleClass);

    EntityType getEntityType();
    ILootTableManager getLootTableManager();

    IGameEntity spawn(Location loc, IGame game);
    IGameEntity spawn(Location loc, IGame game, boolean isImportant);
    IGameEntity spawn(Location loc, IGame game, LivingEntity summoner);
    IGameEntity spawn(Location loc, IGame game, boolean isBoss, LivingEntity summoner);
    IGameEntity spawn(Location loc, IGame game, boolean isBoss, LivingEntity summoner, boolean isImportant);

    ConfigurationSection getSection();
}
