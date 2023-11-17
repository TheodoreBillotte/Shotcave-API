package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.objects.IDataContainer;
import fr.theobosse.shotcaveapi.objects.entities.IMobConfig;
import org.bukkit.entity.Entity;

import javax.annotation.Nullable;
import java.util.ArrayList;

public interface IMobConfigManager {

    @Nullable IMobConfig getConfigEntity(Entity entity);
    @Nullable IMobConfig getConfigEntity(String id);
    ArrayList<IMobConfig> getMobConfigs();

    IDataContainer getData(Entity entity);

}
