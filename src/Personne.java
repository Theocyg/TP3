import java.util.*;
abstract class Personne {
    public String nom;
    public String prenom;
    public Personne(String nom, String prenom){
        this.nom= validate(nom, 50);
        this.prenom= validate(prenom, 50);
    }
    String validate(String chaine, Integer taille){
        chaine = chaine.substring(50, taille);
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

    public static String toString() { }
}
