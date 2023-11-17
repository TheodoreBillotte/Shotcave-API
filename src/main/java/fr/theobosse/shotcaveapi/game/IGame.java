package fr.theobosse.shotcaveapi.game;

import fr.theobosse.shotcaveapi.generation.MazeInfo;
import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import org.bukkit.Location;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Random;

public interface IGame {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    String getName();


    int getCurrentLevel();
    int getLevelSpawnedMobs();
    int getRemainingMobs();
    int getLastCollectedMoneyAmount();
    int getMoney();

    long getStartTimeMillis();
    long getLastCollectedMoneyTimeMillis();

    boolean isPlayerInsideBossRoom();
    boolean isGenerationDone();
    boolean isQueueStart();

    Random getRandom();


    Location getDungeonLoc();
    Location getDungeonStart();
    Location getDungeonSpawn();
    List<IGameLivingEntity> getBoss();
    BossBar getProgressBossBar();
    ArmorStand getBeginningStartTutorial();

    IGamePlayer getGamePlayer(Player player);
    IGameScoreboardManager getScoreboardManager();
    GameState getState();
    IGameStructure getStructure();
    IGamePlayer getHost();
    ILevel getLevel();


    List<Entity> getEntities();
    List<IGamePlayer> getPlayers();
    List<String> getPlayerNames();
    List<MazeInfo> getGenerationInfos();
    List<IGamePlayer> getAlivePlayers();


      /////////////////////
     //     SETTERS     //
    /////////////////////

    void setState(GameState state);
    void setGenerationDone(boolean generationDone);
    void setCurrentLevel(int currentLevel);
    void setLevelSpawnedMobs(int levelSpawnedMobs);
    void setRemainingMobs(int remainingMobs);
    void setMoney(int amount);


      /////////////////////////////
     //     ADDERS / REMOVERS   //
    /////////////////////////////

    void addLevelSpawnedMobs(int amount);
    void subLevelSpawnedMobs(int amount);
    void addPendingEnemy(ILevel level, PendingEnemy pendingEnemy);
    void addPendingShopDisplay(ILevel level, PendingShopDisplay pendingShopDisplay);
    void addRemainingMobs(int amount);
    void subRemainingMobs(int amount);
    void addPlayer(Player player);
    void removePlayer(Player player);
    void addEntity(Entity entity);
    void addMoney(int amount);
    void subMoney(int amount);
    void addBoss(IGameLivingEntity boss);
    void removeBoss(IGameLivingEntity boss);


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    void teleportToLevel(Player player);
    void join(Player player);
    void leave(Player player);
    void disband(Player player);
    void start();
    void restart();
    void end(boolean instant, EndCause cause);
    void victory();
    void fail();
    void stop();
    void stop(boolean instant);
    void levelCleared();
    void spawnBoss();
    void nextLevel();
    void clearMobs();
    void broadcast(String message);
    void sendTitle(String title, String subtitle);
    void sendTitle(String title, String subtitle, int fadeIn, int stay, int fadeOut);

}
