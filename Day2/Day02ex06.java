package ngamina.Day2;

import java.util.Scanner;

public class Day02ex06 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valeur;
        int max = Integer.MIN_VALUE; // plus petite valeur possible au départ
        int min = Integer.MAX_VALUE; // plus grande valeur possible au départ
        int somme = 0;
        int compteur = 0;

        System.out.println("Entrez des nombres entiers non nuls (0 pour arrêter) :");

        do {
            System.out.print("Valeur : ");
            valeur = sc.nextInt();

            if (valeur != 0) {
                // Mettre à jour max et min
                if (valeur > max) max = valeur;
                if (valeur < min) min = valeur;

                // Somme et compteur pour la moyenne
                somme += valeur;
                compteur++;
            }

        } while (valeur != 0);

        if (compteur > 0) {
            double moyenne = (double) somme / compteur;
            System.out.println("\nRésultats :");
            System.out.println("Plus grande valeur : " + max);
            System.out.println("Plus petite valeur : " + min);
            System.out.println("Moyenne des valeurs : " + moyenne);
        } else {
            System.out.println("Aucune valeur saisie.");
        }

        sc.close();
    }
}
