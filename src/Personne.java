abstract class Personne {
    private String nom;
    private String prenom;
    public Personne(String nom, String prenom){
        this.nom= validate(nom, 50);
        this.prenom= validate(prenom, 50);
    }
    private String validate (String chaine, Integer taille){
        chaine = chaine.substring(50, taille);
        return chaine;
    }

    public  abstract String toString();
}
