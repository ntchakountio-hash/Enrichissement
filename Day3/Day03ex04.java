import java.util.Random;
import java.util.Scanner;

public class Day03ex04 {
    public static void main(String[] args) {

        Random rand = new Random(); // pour générer des nombres aléatoires
        Scanner sc = new Scanner(System.in);
        int taille = 5; // Taille du tableau

        int[] nombre = new int[taille]; // Déclaration du tableau

        // Remplissage du tableau avec des valeurs aléatoires entre 1 et 100
        for (int i = 0; i < taille; i++) {
            nombre[i] = rand.nextInt(100) + 1; // génère entre 1 et 100
        }

        // Affichage du tableau
        System.out.println("Tabeau 1 :");
        for (int i = 0; i < taille; i++) {
            System.out.println(nombre[i] + " ");
        }

        // Recherche du plus grand nombre
        int max = nombre[0];
        for (int i = 1; i < taille; i++) {
            if (nombre[i] > max) {
                max = nombre[i];
            }
        }

        // Affichage du resultat
        System.out.println("\n\nLe plus grand nombre est : " + max);

        // Recherche du plus petit nombre
        int min = nombre[0];
        for (int i = 1; i < taille; i++) {
            if (nombre[i] < min) {
                min = nombre[i];
            }
        }

        // Affichage du resultat
        System.out.println("\n\nLe plus petit nombre est : " + min);

        // Recherche du nombre dans le tableau
        for (int i = 0; i < taille; i++) {
            if (nombre[i] == max) {
                System.out.println("\nle nombre " + max + " est à la position : " + i);
            }
        }

        for (int i = 0; i < taille; i++) {
            if (nombre[i] == min) {
                System.out.println("\nle nombre " + min + " est à la position : " + i);
            }
        }
    }
}
