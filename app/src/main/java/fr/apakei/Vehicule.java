package fr.apakei;

import java.util.ArrayList;

public class Vehicule {
    private String nom;
    private float longueur;
    private float largeur;
    private float hauteur;
    private String plaqueImma;
    private String typeCarburant;
    private float nbKmActuel;
    private float volume;
    private String marque;
    private String leMagasin;

    public Vehicule(String nom, float longueur,float largeur,float hauteur,String plaqueImma,String typeCarburant,float nbKmActuel,float volume,String marque){
        this.nom=nom;
        this.longueur=longueur;
        this.largeur=largeur;
        this.hauteur=hauteur;
        this.plaqueImma=plaqueImma;
        this.typeCarburant=typeCarburant;
        this.nbKmActuel=nbKmActuel;
        this.volume=volume;
        this.marque=marque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
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

    public float getNbKmActuel() {
        return nbKmActuel;
    }

    public void setNbKmActuel(float nbKmActuel) {
        this.nbKmActuel = nbKmActuel;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
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
}
