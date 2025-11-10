package ngamina.Day1;

import java.util.Scanner;

public class Day01ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Afficher les informations du client
        System.out.print("Entrez votre nom : ");
        String nomClient = sc.nextLine();
        System.out.print("Entrez votre prenom : ");
        String prenomClient = sc.nextLine();

        // Afficher les options
        System.out.println("=== Estimation BoisFranc ===");
        System.out.println("1 - Chêne (5$ / m²)");
        System.out.println("2 - Érable (12$ / m²)");
        System.out.println("3 - Pin (10$ / m²)");
        System.out.print("Choisissez le type de plancher (1, 2 ou 3) : ");
        int choix = sc.nextInt();

        double prixMetreCarre;
        String typePlancher;

        // Vérifier le choix
        if (choix == 1) {
            typePlancher = "Chêne";
            prixMetreCarre = 5.0;
        } else if (choix == 2) {
            typePlancher = "Érable";
            prixMetreCarre = 12.0;
        } else if (choix == 3) {
            typePlancher = "Pin";
            prixMetreCarre = 10.0;
        } else {
            System.out.println("Vous n’avez pas choisi le bon type de plancher.");
            sc.close();
            return; // arrête le programme ici
        }

        // Choisir la taille
        System.out.print("Choisissez la longueur de plancher (en mètres) : ");
        double longueur = sc.nextDouble();
        System.out.print("Choisissez la largeur de plancher (en mètres) : ");
        double largeur = sc.nextDouble();

        // calculs
        double surface = longueur * largeur;
        double prixTotal = surface * prixMetreCarre;

        // Résultat
        System.out.println("\n=== Estimé du client ===");
        System.out.println("Nom du client : " + nomClient);
        System.out.println("Type de plancher : " + typePlancher);
        System.out.println("Surface totale : " + surface + " m²");
        System.out.println("Prix total : " + prixTotal + " $");

        sc.close();
    }
}