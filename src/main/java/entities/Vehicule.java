package entities;

public class Vehicule {
    public String couleur;
    public Float poid;

    public Vehicule() {
    }

    public Vehicule(String couleur, Float poid) {
        this.couleur = couleur;
        this.poid = poid;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Float getPoid() {
        return poid;
    }

    public void setPoid(Float poid) {
        this.poid = poid;
    }
}
