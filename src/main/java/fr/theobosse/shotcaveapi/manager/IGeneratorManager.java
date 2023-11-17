package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.generation.generator.Generator;

import java.util.HashMap;

public interface IGeneratorManager {

    Class<? extends Generator> getGenerator(String name);
    HashMap<String, Class<? extends Generator>> getGenerators();

    void addGenerator(String name, Class<? extends Generator> generator);

}
