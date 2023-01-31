class Adresse{
private String rue;
private String ville;
private String codePostal;
public Adresse(String rue, String ville, String codePostal){
        this.rue = validate(rue, 100);
        this.ville = validate(ville, 50);
        this.codePostal = validate(codePostal, 10);
        }
private String validate (String chaine, Integer taille){
        chaine = chaine.substring(0, Math.min(chaine.length(), taille));
        return chaine;
        }
public String toString(){
        return rue + ", " + ville + " " + codePostal;
        }
}
