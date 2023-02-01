import java.util.*;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Architecte extends Personne{

     public Adresse adresse;
     public String telephone;
     private String conseilRegional;
     private boolean inscriptionOrdre;

     public void Maj_conseilRegional(){
         System.out.println(nom+ "/t "+prenom+"/t "+conseilRegional+"/t "+telephone+"/t "+inscriptionOrdre+"/t ");
     }
     public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone){
         super(nom, prenom);
         this.conseilRegional=conseilRegional;
         this.inscriptionOrdre=inscriptionOrdre;
         this.adresse = adresse;
         this.telephone = telephoneValide(telephone);


         public void Maj_conseilRegional(){
             if (inscriptionOrdre) {
                 conseilRegional = conseilRegional + " - Inscrit au conseil de l'ordre";
             } else {
                 conseilRegional = conseilRegional + " - Non inscrit au conseil de l'ordre";
             }

         }

         public String toString(){
             String chaine = "";
             chaine = chaine + this.nom + " " + this.prenom + " ";
             chaine = chaine + this.conseilRegional + " ";
             chaine = chaine + this.adresse + " ";
             chaine = chaine + this.telephone + " ";
             if (inscriptionOrdre){
                 chaine = chaine + "Inscrit" + " ";
             }
             else{
                 chaine = chaine + "Non inscrit" + " ";
             }
             return chaine;
         }
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
         this.telephone = telephone;
     }

     @Override
     public String toString() {
         return null;
     }
 }
