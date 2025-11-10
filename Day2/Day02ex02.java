package ngamina.Day2;

import java.util.Scanner;

public class Day02ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander une phrase ou un mot
        System.out.print("Écris un mot ou une phrase : ");
        String texte = sc.nextLine();

        // Calculer la longueur
        int longueur = texte.length();

        // Afficher le résultat
        System.out.println("La phrase contient " + longueur + " caractères.");

        sc.close();
    }
}
