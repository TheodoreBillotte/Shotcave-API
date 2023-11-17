package fr.theobosse.shotcaveapi.objects.entities;

import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.game.PlayerState;
import fr.theobosse.shotcaveapi.game.death.ICorpse;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;

public interface IGamePlayer extends IGameAlly {

    IGame getGame();

    @Override
    boolean isHeadshottable();

    @Override
    boolean isInvisible();

    @Override
    boolean isEnemy();

    @Override
    boolean isBoss();

    OfflinePlayer getOfflinePlayer();
    @Nullable Player getPlayer();
    ICorpse getCorpse();
    PlayerState getState();
    String getName();

    boolean isGhost();
    boolean isAlive();

    void setGhost(boolean ghost);
    void setState(PlayerState state);

    void faintPlayer();
    void killPlayer();

    void revive(@Nullable IGamePlayer reviver, Location reviveLocation);
    void revive(@Nullable IGamePlayer reviver, Location reviveLocation, double reviveHealth);

    void refillHealth();
    void reset();

    void enableGhostMode();
    void disableGhostMode();

    void hideToAllPlayers();
    void showToAllPlayers();

    boolean giveWeapon(ItemStack itemStack);
    boolean giveItem(ItemStack itemStack);

}
