package fr.theobosse.shotcaveapi.loots;

/**
 * The type of randomness used for the loot table.
 * `DROP`: Default value. Will cycle through all entries and add them to an ArrayList depending on their probability.
 * `WEIGHTED`: Will generate `quantity` items where the `weight` of each entry affects how likely they are to be chosen.
 */
public enum RandomType {
    DROP,
    WEIGHTED
}