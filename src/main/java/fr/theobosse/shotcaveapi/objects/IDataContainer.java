package fr.theobosse.shotcaveapi.objects;

import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Collection;
import java.util.List;

public interface IDataContainer {

      /////////////////////
     //     GETTERS     //
    /////////////////////

    <T, Z> Z get(String data, PersistentDataType<T, Z> type);

    int getInt(String data);
    double getDouble(String data);
    float getFloat(String data);
    long getLong(String data);
    String getString(String data);
    String[] getStringArray(String data);
    boolean getBoolean(String data);
    IDataContainer getDataContainer(String data);
    List<IDataContainer> getDataContainerArray(String data);
    PersistentDataContainer getContainer();

      /////////////////////
     //     SETTERS     //
    /////////////////////

    <T, Z> void set(String data, PersistentDataType<T, Z> type, Z value);

    void setInt(String data, int value);
    void setDouble(String data, double value);
    void setFloat(String data, float value);
    void setLong(String data, long value);
    void setString(String data, String value);
    void setStringArray(String data, Collection<String> value);
    void setBoolean(String data, boolean value);
    void setDataContainer(String data, IDataContainer value);
    void setDataContainerArray(String data, Collection<IDataContainer> values);



      /////////////////////
     //     METHODS     //
    /////////////////////

    void add(String data, double value);
    void sub(String data, double value);
    void appendString(String data, String value);

    <T, Z> boolean contains(String data, PersistentDataType<T, Z> type);
    boolean containsInt(String data);
    boolean containsDouble(String data);
    boolean containsFloat(String data);
    boolean containsLong(String data);
    boolean containsString(String data);
    boolean containsStringArray(String data);
    boolean containsBoolean(String data);
    boolean containsDataContainerArray(String name);
}
