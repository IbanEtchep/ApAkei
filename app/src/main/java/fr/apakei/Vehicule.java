package fr.apakei;

public class Vehicule {

    private String nom;
    private double longueur;
    private double largeur;
    private double hauteur;
    private String plaqueImma;
    private String typeCarburant;
    private double nbKmActuel;
    private double volume;
    private String marque;
    private String leMagasin;

    public Vehicule(String nom, double longueur, double largeur, double hauteur, String plaqueImma, String typeCarburant, double nbKmActuel, double volume, String marque) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.plaqueImma = plaqueImma;
        this.typeCarburant = typeCarburant;
        this.nbKmActuel = nbKmActuel;
        this.volume = volume;
        this.marque = marque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getPlaqueImma() {
        return plaqueImma;
    }

    public void setPlaqueImma(String plaqueImma) {
        this.plaqueImma = plaqueImma;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public double getNbKmActuel() {
        return nbKmActuel;
    }

    public void setNbKmActuel(double nbKmActuel) {
        this.nbKmActuel = nbKmActuel;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLeMagasin() {
        return leMagasin;
    }

    public void setLeMagasin(String leMagasin) {
        this.leMagasin = leMagasin;
    }

    @Override
    public String toString() {
        return getMarque() + " " + getNom() + " " + getTypeCarburant();
    }
}
