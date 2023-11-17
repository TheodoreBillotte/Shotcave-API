package fr.theobosse.shotcaveapi.objects.sounds;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public interface ISoundPlayer {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    double getPitch();
    double getVolume();
    Sound getSound();


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    void play(Player player, Location location);
    void play(Location location);
}
