package fr.theobosse.shotcaveapi.chemistry;

import fr.theobosse.shotcaveapi.objects.entities.IGameEntity;
import org.bukkit.configuration.ConfigurationSection;

public abstract class ReactionConsequence {
    private final ConfigurationSection config;

    public ReactionConsequence(ConfigurationSection config) {
        this.config = config;
    }
    public abstract void onReact(IGameEntity gameEntity);
}
