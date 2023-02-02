import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Architecte> architectes = new ArrayList<>();
        while (true) {
            System.out.println("Entrez le nom de l'architecte : (Entrez stop pour quitter):\n ");
            String nom = sc.next();
            if (nom.equals("stop")) {
                break;
            }
            System.out.println("Entrez le prénom de l'architecte : \n");
            String prenom = sc.next();
            System.out.println("Quel est votre civilité : \n");
            String civilite = sc.next();
            System.out.println("Quel est votre mail : \n");
            String mail = sc.next();
            System.out.println("Entrez le conseil régional de l'architecte \n: ");
            String conseilRegional = sc.next();
            System.out.println("Est-il inscrit au conseil de l'ordre (true / false) :\n ");
            boolean inscriptionOrdre = sc.nextBoolean();
            System.out.println("Entrez la rue de l'adresse :\n ");
            String rue = sc.next();
            System.out.println("Entrez la ville de l'adresse : \n");
            String ville = sc.next();
            System.out.println("Entrez le code postal de l'adresse :\n ");
            String codePostal = sc.next();
            System.out.println("Entrez le téléphone de l'architecte :\n ");
            String telephone = sc.next();

            Adresse adresse = new Adresse(rue, ville, codePostal);
            Architecte architecte = new Architecte(nom, prenom, civilite, mail, conseilRegional, inscriptionOrdre, adresse, telephone);
            System.out.println(architecte);


        }
        System.out.println("Liste des architectes: ");
        for (Architecte a : architectes) {
            System.out.println(a);
        }
     }
    }
