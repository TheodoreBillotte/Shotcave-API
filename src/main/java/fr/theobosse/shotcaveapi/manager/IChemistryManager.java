package fr.theobosse.shotcaveapi.manager;

import fr.theobosse.shotcaveapi.chemistry.ChemistryReaction;
import fr.theobosse.shotcaveapi.chemistry.Element;
import fr.theobosse.shotcaveapi.chemistry.GameEffect;
import fr.theobosse.shotcaveapi.chemistry.ReactionConsequence;
import fr.theobosse.shotcaveapi.objects.entities.IGameEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public interface IChemistryManager {
    ChemistryReaction getReaction(Element baseReactant, Element outsideReactant);
    ChemistryReaction getReaction(String baseReactantName, String outsideReactantName);
    ArrayList<ReactionConsequence> getConsequences(String baseReactantName, String outsideReactantName);
    ArrayList<ReactionConsequence> getConsequences(Element baseReactant, Element outsideReactant);
    GameEffect getEffect(String name);
    Element getElement(String elementId);
    ArrayList<Element> getElements(Collection<String> elementsList);
    ArrayList<Element> getElements(String... elementsList);

    void addReaction(ChemistryReaction reaction);
    void addReaction(Element baseReactant, Element outsideReactant, ArrayList<ReactionConsequence> consequences);

    void forAllReactions(Consumer<ChemistryReaction> function);
    void applyReaction(IGameEntity gameEntity, Element baseReactant, Element outsideReactant);
}
