package fr.apakei;

public class Employe {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private String leRayon;
    private String leMagasin;

    public Employe(String nom, String prenom, String tel, String mail){
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.mail=mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLeRayon() {
        return leRayon;
    }

    public void setLeRayon(String leRayon) {
        this.leRayon = leRayon;
    }

    public String getLeMagasin() {
        return leMagasin;
    }

    public void setLeMagasin(String leMagasin) {
        this.leMagasin = leMagasin;
    }
}
