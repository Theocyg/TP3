import java.util.*;
abstract class Personne {
    public String nom;
    public String prenom;
    public Personne(String nom, String prenom){
        this.nom= validate(nom, 10);
        this.prenom= validate(prenom, 10);
    }
    String validate(String chaine, int taille) {
        if (chaine.length() > taille) {
            chaine = chaine.substring(0, taille);
        }
        return chaine;
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

    public abstract String toString();
}
