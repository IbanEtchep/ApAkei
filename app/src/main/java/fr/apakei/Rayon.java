package fr.apakei;

import java.util.ArrayList;

public class Rayon {
    private String libelle;
    private String descriptif;
    private ArrayList<Produit> lesProduits;
    private ArrayList<Employe> lesEmployes;

    public Rayon(String libelleR, String descriptifR){
        this.libelle=libelleR;
        this.descriptif=descriptifR;
        this.lesProduits=new ArrayList<Produit>();
        this.lesEmployes=new ArrayList<Employe>();
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public ArrayList<Produit> getLesProduits(){
        return lesProduits;
    }
    public int addProduit(Produit unProduit){
        lesProduits.add(unProduit);
        return lesProduits.indexOf(unProduit);
    }
    public Produit getProduit(int num){
        return lesProduits.get(num);
    }

    public ArrayList<Employe> getLesEmployes(){
        return lesEmployes;
    }
    public int addEmploye(Employe unEmploye){
        lesEmployes.add(unEmploye);
        return lesEmployes.indexOf(unEmploye);
    }
    public Employe getEmploye(int num){
        return lesEmployes.get(num);
    }
}
