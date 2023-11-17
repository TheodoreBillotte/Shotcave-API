package fr.theobosse.shotcaveapi.event.player;

import fr.theobosse.shotcaveapi.objects.entities.IGamePlayer;
import fr.theobosse.shotcaveapi.objects.lootcrates.ILootCrate;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;

public class GamePlayerOpenLootCrateEvent extends GamePlayerEvent implements Cancellable {
    private final ILootCrate lootCrate;
    private final Block block;
    private boolean cancel = false;

    public GamePlayerOpenLootCrateEvent(IGamePlayer gamePlayer, ILootCrate lootCrate, Block block) {
        super(gamePlayer);
        this.lootCrate = lootCrate;
        this.block = block;
    }

    public ILootCrate getLootCrate() {
        return lootCrate;
    }

    public Block getBlock() {
        return block;
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
