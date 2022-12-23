package org.example.DiagramUML;

import org.example.AOP.Log;

import java.util.List;

@Log
public class Diagramme {
    //diagramme de classe
    private String nom;
    //liste d’entités: classes, interfaces, Annotations, Enumérations,Record
    private List<Entite> entites;
    //liste de relations
    private List<Relation> relations;
}
