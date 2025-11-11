import java.util.Random;

public class Day03ex05 {
     // 🔹 Méthode pour afficher le contenu d’un tableau
    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " "); //Tableau horizontal
        }
        System.out.println(); // saut de ligne
    }

    public static void main(String[] args) {
        Random rand = new Random();

        // 🔹 Déclaration du tableau
        int[] nombres = new int[10];

        // 🔹 Remplissage avec des nombres aléatoires entre 0 et 100
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = rand.nextInt(101); // 0 à 100 inclus
        }

        // 🔹 Affichage avant permutation
        System.out.println("Tableau original :");
        afficherTableau(nombres);

        // 🔹 Permutation (1er ↔ dernier, 2e ↔ avant-dernier, etc.)
        for (int i = 0; i < nombres.length / 2; i++) {
            int temp = nombres[i];
            nombres[i] = nombres[nombres.length - 1 - i];
            nombres[nombres.length - 1 - i] = temp;
        }

        // 🔹 Affichage après permutation
        System.out.println("\nTableau après permutation :");
        afficherTableau(nombres);
    }
}
