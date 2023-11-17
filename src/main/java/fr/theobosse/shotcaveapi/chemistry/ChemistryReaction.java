package fr.theobosse.shotcaveapi.chemistry;

import java.util.ArrayList;

public record ChemistryReaction(Element baseReactant, Element outsideReactant, ArrayList<ReactionConsequence> consequences) {};
