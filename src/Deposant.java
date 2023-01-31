import Personne;

public class Deposant extends Personne {
    private String civilite;
    private String mail;
    private String adresse;

    public Deposant (String civilite, String mail, String adresse){
        super(nom, prenom);
        this.civilite= validate(civilite,10);
        this.mail=validate(mail,10);
        this.adresse=adresse;
    }
    @Override
    public String toString(){
        return "Deposant\ncivilite=" + civilite + ", mail=" + mail + ", adresse=" + adresse + ", nom=" +nom+ ", prenom=" +prenom;
    }
}
