package fr.apakei;

import java.util.ArrayList;

public class Produit {
    private String nom;
    private String descTech;
    private float prix;
    private float poids;
    private float longueur;
    private float hauteur;
    private float largeur;
    private String leRayon;

    public Produit(String nom, String descTech, float prix, float poids, float longueur, float hauteur, float largeur){
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public String getLeRayon() {
        return leRayon;
    }

    public void setLeRayon(String leRayon) {
        this.leRayon = leRayon;
    }
}
