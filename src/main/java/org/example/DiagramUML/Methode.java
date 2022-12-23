package org.example.DiagramUML;

public class Methode {
    private String nom;
    private String type;
    private String visibilite;
    private Boolean estStatic;
    private Boolean estFinal;
    private Parameter[] parametres;

    public Methode(String nom, String type, String visibilite, Boolean estStatic, Boolean estFinal, Parameter[] parametres) {
        this.nom = nom;
        this.type = type;
        this.visibilite = visibilite;
        this.estStatic = estStatic;
        this.estFinal = estFinal;
        this.parametres = parametres;
    }
}
