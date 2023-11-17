package fr.theobosse.shotcaveapi.objects.collectibles;

import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ICollectible {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    CollectMethod getCollectMethod();

    ItemStack getItemStack(int amount);
    ItemStack getItemStack();


    /**
     * Returns the string representing the floating text above the dropped item.
     *
     * @param amount The amount stored in the item.
     * @return The string that should be displayed above the item.
     */
    String getDroppedName(int amount);
    String getCollectibleId();


    /**
     * Manages the pickup of a collectible itemStack. Correctly returns the amount that should be given to the
     * collector. (Correctly manages cases where the ItemStack size and amount per item are more than 1)
     *
     * @param item               The collectible that is being picked up
     * @param collectorAmount    The amount of the Collectible's resource (ammo, health...) that the collector (player, ...) has
     * @param collectorMaxAmount The maximum amount the collector can have
     * @return The amount that should be given the collector
     */
    int getPickupAmount(Item item, int collectorAmount, int collectorMaxAmount);
    int getTotalItemAmount(Item item);
    int getAmount(Item item);


      /////////////////////////////
     //     IMPLEMENTATIONS     //
    /////////////////////////////

    boolean collect(Item item, Player player);
    CollectInfo giveItem(Item item, Player player);

    Item dropItem(Location location, int amount);
    Item dropItem(Location location, int amount, boolean showNametags);
    Item dropItem(Location location, int amount, ItemStack itemStack);
    Item dropItem(Location location, int amount, ItemStack itemStack, boolean showNametags);

    Item spawnItem(Location location, int amount);

    void markItemAsCollectible(Item item, int amount);
    void markItemAsCollectible(Item item, int amount, boolean showNametags);

}
