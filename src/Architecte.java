import java.lang.String;
import java.lang.Character;


class Architecte extends Personne {

    public Adresse adresse;
    public String telephone;
    private String conseilRegional;
    private boolean inscriptionOrdre;

    private boolean telephoneValide(String telephone){
        if (telephone == null || telephone.length() != 15) {
            return false;
        }

        for (int i = 0; i < 15; i++) {
            if (!Character.isDigit(telephone.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public Architecte(String nom,String prenom,String civilite,String mail, String conseilRegional,boolean inscriptionOrdre,Adresse adresse,String telephone) {
        super(nom,prenom);
        this.conseilRegional = conseilRegional;
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;

        if (telephoneValide(telephone)){
            this.telephone = telephone;
        }
        else{
            this.telephone = "";
            System.out.println("Numéro de téléphone non valide.");
        }
    }

    public void majConseilRegional() {
        if (inscriptionOrdre) {
            conseilRegional = conseilRegional + " - Inscrit au conseil de l'ordre";
        } else {
            conseilRegional = conseilRegional + " - Non inscrit au conseil de l'ordre";
        }
    }

    public String toString () {
        String chaine = "";
        chaine = chaine + this.conseilRegional + " ";
        chaine = chaine + this.adresse + " ";
        chaine = chaine + this.telephone + " ";
        if (inscriptionOrdre) {
            chaine = chaine + "Inscrit" + " ";
        } else {
            chaine = chaine + "Non inscrit" + " ";
        }
        return chaine;
    }

    public void setConseilRegional(String conseilRegional) {
        this.conseilRegional = conseilRegional;
    }

    public String getConseilRegional() {
        return conseilRegional;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (telephoneValide(telephone)){
            this.telephone = telephone;
        }
        else{
            this.telephone = "";
            System.out.println("Numéro de téléphone non valide.");
        }
    }
}
