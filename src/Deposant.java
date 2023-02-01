import java.util.*;
class Deposant extends Personne{
    private String civilite;
    private String mail;
    private Adresse adresse;
    public Deposant(String nom, String prenom, String civilite, String mail, Adresse adresse) {
        super(nom, prenom);
        this.civilite = validate(civilite, 10);
        this.mail = validate(mail, 100);
        this.adresse = adresse;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Deposant civilite=" + civilite + ", mail=" + mail + ", adresse=" + adresse + ", nom=" + nom + ", prenom=" + prenom +"";
    }
}
