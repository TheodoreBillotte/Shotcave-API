package fr.theobosse.shotcaveapi.objects.sounds;

import org.bukkit.Location;

public interface IMusicPlayer {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    float getPitch(int i);


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    void playNote(int i, Location location);
}
