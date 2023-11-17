package fr.theobosse.shotcaveapi.event.game;

import fr.theobosse.shotcaveapi.game.IGame;
import org.bukkit.event.Cancellable;

public class GameCreateEvent extends GameEvent implements Cancellable {

    private boolean cancelled = false;

    public GameCreateEvent(IGame game) {
        super(game);
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
