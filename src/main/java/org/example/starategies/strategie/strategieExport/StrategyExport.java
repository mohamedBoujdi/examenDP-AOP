package org.example.starategies.strategie.strategieExport;

import org.example.DiagramUML.Diagramme;

public interface StrategyExport {
    byte[] export(Diagramme classDiagram);
}
