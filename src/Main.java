import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de l'architecte :\n ");
        String nom = sc.nextLine();
        System.out.println("Entrez le prénom de l'architecte : \n");
        String prenom = sc.nextLine();
        System.out.println("Quel est votre civilité : \n");
        String civilite = sc.nextLine();
        System.out.println("Quel est votre mail : \n");
        String mail = sc.nextLine();
        System.out.println("Entrez le conseil régional de l'architecte \n: ");
        String conseilRegional = sc.nextLine();
        System.out.println("Est-il inscrit au conseil de l'ordre (Oui / Non) :\n ");
        boolean inscriptionOrdre = sc.nextBoolean();
        System.out.println("Entrez la rue de l'adresse :\n ");
        String rue = sc.nextLine();
        System.out.println("Entrez la ville de l'adresse : \n");
        String ville = sc.nextLine();
        System.out.println("Entrez le code postal de l'adresse :\n ");
        String codePostal = sc.nextLine();
        System.out.println("Entrez le téléphone de l'architecte :\n ");
        String telephone = sc.nextLine();

        Adresse adresse = new Adresse(rue, ville, codePostal);
        Architecte architecte1 = new Architecte("Dupont", "Jacques","homme", "jacquesdupont@gmail.com", "Ordre des Architectes de France", true, adresse1, "0612345678");

        System.out.println("\n" + architecte.toString());
    }
}
