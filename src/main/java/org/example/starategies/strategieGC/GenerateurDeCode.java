package org.example.starategies.strategieGC.context;

import org.example.DiagramUML.Diagramme;
import org.example.starategies.strategieGC.StrategyGenCode;
//client
public class GenerateurDeCode {
    private StrategyGenCode strategy;

    public GenerateurDeCode(StrategyGenCode strategy) {
        this.strategy = strategy;
    }

    public String generateCode(Diagramme classDiagram) {
        return strategy.generateCode(classDiagram);
    }
}
