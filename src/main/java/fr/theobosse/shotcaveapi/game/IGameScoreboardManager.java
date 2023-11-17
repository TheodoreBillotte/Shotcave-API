package fr.theobosse.shotcaveapi.game;

import org.bukkit.entity.Player;

public interface IGameScoreboardManager {

    void addPlayer(Player player);
    void resetScoreboard(Player player);
    void updateScoreboard();

}
