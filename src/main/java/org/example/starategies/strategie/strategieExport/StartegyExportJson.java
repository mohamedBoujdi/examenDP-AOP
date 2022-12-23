package org.example.starategies.strategie.strategieExport;

import org.example.DiagramUML.Diagramme;

public class StartegyExportJson implements StrategyExport {

        @Override
        public byte[] export(Diagramme classDiagram) {
            System.out.println("Exportation en JSON");
            // Serialisation du diagramme de classes en JSON
            return null;
        }
}
