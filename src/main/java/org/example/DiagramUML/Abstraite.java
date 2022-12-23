package org.example.DiagramUML;

public class Abstraite extends Methode {
    //constante de classe
    private static final String TYPE = "abstraite";

    public Abstraite(String nom, String type, String visibilite, Boolean estStatic, Boolean estFinal, Parameter[] parametres, Boolean estAbstract) {
        super(nom, type, visibilite, estStatic, estFinal, parametres);
        this.estAbstract = estAbstract;
    }

    public Boolean getEstAbstract() {
        return estAbstract;
    }

    public void setEstAbstract(Boolean estAbstract) {
        this.estAbstract = estAbstract;
    }
}

}
