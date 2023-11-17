package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public interface IGameManager {

    IGame getGame(String name);
    IGame getGame(Player player);
    IGame getGame(Entity entity);
    IGamePlayer getGamePlayer(Player player);
    boolean isGamePlayer(Player player);

    HashMap<String, IGame> getGames();
    HashMap<UUID, IGamePlayer> getPlayers();

    void addGame(IGame game);
    void removeGame(IGame game);

    void addPlayer(IGamePlayer player);
    void removePlayer(IGamePlayer player);

}
