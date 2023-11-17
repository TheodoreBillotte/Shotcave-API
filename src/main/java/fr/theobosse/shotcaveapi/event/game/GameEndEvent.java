package fr.theobosse.shotcaveapi.event.game;

import fr.theobosse.shotcaveapi.game.EndCause;
import fr.theobosse.shotcaveapi.game.IGame;

public class GameEndEvent extends GameEvent {
    private final EndCause cause;

    public GameEndEvent(IGame game, EndCause cause) {
        super(game);
        this.cause = cause;
    }

    public EndCause getCause() {
        return cause;
    }
}
