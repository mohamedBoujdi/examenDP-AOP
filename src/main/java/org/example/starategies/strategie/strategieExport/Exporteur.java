package org.example.starategies.strategie.strategieExport;

import org.example.DiagramUML.Diagramme;

public class Exporteur {
    private StrategyExport strategy;
    public ClassDiagramSerializer( StrategyExport strategy) {
        this.strategy = strategy;
    }

    public byte[] serialize(Diagramme classDiagram) {
        return strategy.export(classDiagram);
    }
}
