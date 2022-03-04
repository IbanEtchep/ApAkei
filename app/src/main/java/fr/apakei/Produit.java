package fr.apakei;

import java.util.ArrayList;

public class Produit {
    private String nom;
    private String descTech;
    private double prix;
    private double poids;
    private double longueur;
    private double hauteur;
    private double largeur;
    private String leRayon;

    public Produit(String nom, String descTech, double prix, double poids, double longueur, double hauteur, double largeur){
        this.nom=nom;
        this.descTech=descTech;
        this.prix=prix;
        this.poids=poids;
        this.longueur=longueur;
        this.hauteur=hauteur;
        this.largeur=largeur;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescTech() {
        return descTech;
    }

    public void setDescTech(String descTech) {
        this.descTech = descTech;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public String getLeRayon() {
        return leRayon;
    }

    public void setLeRayon(String leRayon) {
        this.leRayon = leRayon;
    }
}
