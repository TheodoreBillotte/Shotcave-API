package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.game.death.ICorpse;

public class GamePlayerFaintEvent extends GamePlayerEvent {
    private final ICorpse corpse;

    public GamePlayerFaintEvent(IGamePlayer gamePlayer, ICorpse corpse) {
        super(gamePlayer);
        this.corpse = corpse;
    }

    public ICorpse getCorpse() {
        return corpse;
    }
}
