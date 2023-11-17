package fr.theobosse.shotcaveapi.chemistry;

import fr.theobosse.shotcaveapi.manager.IChemistryManager;
import fr.theobosse.shotcaveapi.objects.entities.IGameLivingEntity;
import fr.theobosse.shotcaveapi.objects.IDataContainer;
import org.bukkit.configuration.ConfigurationSection;

import java.util.ArrayList;

public abstract class GameEffect {
    private final String id;
    private final ArrayList<Element> elements;
    private final long intervalMillis;

    public GameEffect(IChemistryManager chemManager, ConfigurationSection config) {
        this.id = config.getName();
        this.elements = chemManager.getElements(config.getStringList("elements"));

        this.intervalMillis = config.getInt("interval", 0) * 50L;
    }

    public abstract void startEffect(IGameLivingEntity gameLivingEntity, int durationTicks);

    public abstract void onEffectEnd(IGameLivingEntity gameLivingEntity);

    public abstract void update(IGameLivingEntity gameLivingEntity);

    public abstract String getLoreText(GameEffectParameters effectParameters);

    protected void assignEffectData(IGameLivingEntity gameLivingEntity, int durationTicks) {
        IDataContainer data = gameLivingEntity.getDataContainer();

        data.appendString("effects", this.id);
        data.setLong(id + ".start-time", System.currentTimeMillis());
        data.setLong(id + ".duration", durationTicks * 50L);
        data.setInt(id + ".iterations", 0);
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public long getIntervalMillis() {
        return intervalMillis;
    }
    public double getIntervalSeconds() {
        return ((double) intervalMillis) / 1000;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "gameeffect:" + this.id;
    }

}
