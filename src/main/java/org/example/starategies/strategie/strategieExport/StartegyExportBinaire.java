package org.example.starategies.strategie.strategieExport;

import org.example.DiagramUML.Diagramme;

public class StartegyExportBinaire implements StrategyExport {

    @Override
    public byte[] export(Diagramme classDiagram) {
        System.out.println("Exportation en binaire");
        // Serialisation du diagramme de classes en binaire
        return null;
    }
}
