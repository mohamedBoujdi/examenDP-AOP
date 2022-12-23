package org.example.starategies.strategieGC;

import org.example.DiagramUML.Attribut;
import org.example.DiagramUML.Diagramme;
import org.example.DiagramUML.Entity;

public class StrategyGenCodeJava implements StrategyGenCode {
    public String generateCode(Diagramme classDiagram) {
        String code = "java code";
        //code java for class ,interface, enum,annotation,record
        for (Entity entity : classDiagram.getEntities()) {
            code += "public " + entity.getType().toString().toLowerCase() + " " + entity.getName() + " {\n";
            for (Attribut attribute : entity.getAttributes()) {
                code += "    " + attribute.getVisibility().toString().toLowerCase() + " " + attribute.getType() + " " + attribute.getName() + ";\n";
            }
            code += "}\n\n";
        }

        return code;
    }
}

