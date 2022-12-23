package org.example.starategies.strategieGC;

import org.example.DiagramUML.Attribut;
import org.example.DiagramUML.Diagramme;
import org.example.DiagramUML.Entity;

public class StrategyGenCodePHP implements StrategyGenCode {
    public String generateCode(Diagramme classDiagram) {
        //code php
        String code = "";
        for (Entity entity : classDiagram.getEntities()) {
            code += "<?php\n\n";
            code += "class " + entity.getName() + " {\n";
            for (Attribut attribute : entity.getAttributes()) {
                code += "    " + attribute.getVisibility().toString().toLowerCase() + " $" + attribute.getName() + ";\n";
            }
            code += "}\n\n";
        }
        return code;
    }
}
