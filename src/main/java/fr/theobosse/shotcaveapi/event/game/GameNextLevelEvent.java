package fr.theobosse.shotcaveapi.event.game;

import fr.theobosse.shotcaveapi.game.IGame;
import fr.theobosse.shotcaveapi.game.ILevel;

public class GameNextLevelEvent extends GameEvent {
    private final ILevel level;

    public GameNextLevelEvent(IGame game) {
        super(game);
        this.level = game.getLevel();
    }

    public ILevel getLevel() {
        return level;
    }
}
