package fr.apakei;

import java.util.ArrayList;

public class Modele {
    private static ArrayList<Rayon> lesRayons = new ArrayList<Rayon>();
    private static ArrayList<Magasin> lesMagasins = new ArrayList<Magasin>();

    public static ArrayList<Rayon> getLesRayons(){
        return lesRayons;
    }

    public static Rayon getLeRayon(int num){
        return lesRayons.get(num);
    }

    public static int addRayon(String libelleR, String descriptifR){
        Rayon unRayon = new Rayon(libelleR, descriptifR);
        lesRayons.add(unRayon);
        return lesRayons.indexOf(unRayon);
    }

    public static ArrayList<Magasin> getLesMagasins(){
        return lesMagasins;
    }

    public static Magasin getLeMagasin(int num){
        return lesMagasins.get(num);
    }

    public static int addMagasin(String nom, String adresse, String cp, String ville){
        Magasin unMagasin = new Magasin(nom, adresse, cp, ville);
        lesMagasins.add(unMagasin);
        return lesMagasins.indexOf(unMagasin);
    }

    public static void init(){
        int num=Modele.addRayon("Tables","Tables de cuisine, tables basses...");
        Modele.getLeRayon(num).addProduit(new Produit("Fjallbo","Table basse, noire",69.95f,5.0f,152f,75f,95f));
        Employe employeUn=new Employe("Jean","Baptiste","0612345678","jean.baptiste@gmail.com");
        Modele.getLeRayon(num).addEmploye(employeUn);

        int numm=Modele.addMagasin("Akei Pays basque", "2-4 Av. du Portou", "64990", "Saint-Pierre-d'Irube");
        Modele.getLeMagasin(numm).addEmploye(employeUn);
        Modele.getLeMagasin(numm).addVehicule(new Vehicule("Ducato", 2670f,1870f,1662f,"AF-512-FM", "Essence",32000f,20f,"Fiat"));
    }

}
