package fr.theobosse.shotcaveapi.event.game;

import fr.theobosse.shotcaveapi.game.IGame;
import org.bukkit.event.Cancellable;

public class GameStartEvent extends GameEvent implements Cancellable {

    private boolean cancel = false;

    public GameStartEvent(IGame game) {
        super(game);
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
