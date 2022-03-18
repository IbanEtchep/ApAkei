package fr.apakei;

import java.util.ArrayList;

public class    Modele {
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
        Modele.getLeRayon(num).addProduit(new Produit("Fjallbo","Table basse",69.95,5.0,152,75,95, "noir"));
        Employe employeUn=new Employe("Jean","Baptiste","0612345678","jean.baptiste@gmail.com");
        Modele.getLeRayon(num).addEmploye(employeUn);

        int num2=Modele.addRayon("Luminaires","Lampadaires, Suspensions, Lampe de bureau...");
        Modele.getLeRayon(num2).addProduit(new Produit("Luminaire 3d","Luminaire3D stylée",60.99,2.0,100,15,50, "blanc"));
        Employe employe=new Employe("Dupont","Dupont","0678451296","dupont.dupont@gmail.com");
        Modele.getLeRayon(num2).addEmploye(employe);
        Employe employe2=new Employe("Eric","Ramzi","0677245296","eric.ramzi@gmail.com");
        Modele.getLeRayon(num2).addEmploye(employe2);


        int numm=Modele.addMagasin("Akei Pays basque", "2-4 Av. du Portou", "64990", "Saint-Pierre-d'Irube");
        Modele.getLeMagasin(numm).addEmploye(employeUn);
        Modele.getLeMagasin(numm).addVehicule(new Vehicule("Ducato", 2670,1870,1662,"AF-512-FM", "Essence",32000,20,"Fiat"));
        Modele.getLeMagasin(numm).addVehicule(new Vehicule("Partner", 2670,1870,1662,"EU-325-VS", "Diesel",3000,20,"Peugeot"));
        Modele.getLeMagasin(numm).addVehicule(new Vehicule("Zoe", 2370,450,1662,"DF-598-ES", "Electric",32000,20,"Renault"));

        int nummm=Modele.addMagasin("Akei Bordeaux", "avenue des 40 Journaux", "33300", "Bordeaux");
        Modele.getLeMagasin(nummm).addEmploye(employeUn);
        Modele.getLeMagasin(nummm).addVehicule(new Vehicule("Ducato", 2670,1870,1662,"AF-512-FM", "Essence",15300,20,"Fiat"));
    }

}
