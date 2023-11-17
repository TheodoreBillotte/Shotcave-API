package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.generation.rooms.IRoomBlock;
import org.bukkit.block.Block;
import org.jetbrains.annotations.NotNull;

public interface IRoomBlockManager {

    @NotNull IRoomBlock get(Block block);
    IRoomBlock get(String namespace);

    void register(IRoomBlock block);

}
