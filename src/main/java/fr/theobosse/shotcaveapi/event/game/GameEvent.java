package fr.theobosse.shotcaveapi.event.game;

import fr.theobosse.shotcaveapi.game.IGame;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class GameEvent extends Event {

    private final IGame game;
    private static final HandlerList HANDLERS = new HandlerList();

    public GameEvent(IGame game) {
        this.game = game;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
    
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public IGame getGame() {
        return game;
    }
}
