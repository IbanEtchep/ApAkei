package fr.apakei;

import java.util.ArrayList;

public class Magasin {
    private String nom;
    private String adresse;
    private String cp;
    private String ville;
    private ArrayList<Employe> lesEmployes;
    private ArrayList<Vehicule> lesVehicules;



    public Magasin(String nom, String adresse, String cp, String ville){
        this.nom=nom;
        this.adresse=adresse;
        this.cp=cp;
        this.ville=ville;
        this.lesEmployes=new ArrayList<Employe>();
        this.lesVehicules=new ArrayList<Vehicule>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
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

    public ArrayList<Vehicule> getLesVehicules(){
        return lesVehicules;
    }
    public int addVehicule(Vehicule UnVehicule){
        lesVehicules.add(UnVehicule);
        return lesVehicules.indexOf(UnVehicule);
    }
    public Vehicule getVehicule(int num){
        return lesVehicules.get(num);
    }
}
