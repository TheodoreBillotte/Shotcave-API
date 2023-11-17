package fr.theobosse.shotcaveapi.objects.lootcrates;

import fr.theobosse.shotcaveapi.loots.ILootTableManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public interface ILootCrate {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    String getId();
    String getLootTableId();

    @Nullable
    ILootTableManager getLootTable();
    Material getBlockMaterial();


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    void open(Block block, LivingEntity opener);
    void create(Location loc);
    void breakBlock(Block block);

}
