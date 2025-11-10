import java.util.Random;

public class Day03ex03 {

    public static void main(String[] args) {

        Random rand = new Random(); // pour générer des nombres aléatoires
        int taille = 10;         // Taille du tableau

        int[] tableau1 = new int[taille]; //Déclaration du tableau

        // Remplissage du tableau avec des valeurs aléatoires entre 1 et 100
        for (int i = 0; i < taille; i++) {
            tableau1[i] = rand.nextInt(100) + 1; // génère entre 1 et 100
        }

        //Création du tableau 2
        int[] tableau2 = new int[taille]; // Meme taille

        // Inversion du tableau 2
        for (int i = 0; i < taille; i++) {
            tableau2[i] = tableau1[taille - 1 - i];
        }

        // Affichage des deux tableaux
        System.out.println("Tabeau 1 :");
        for (int i = 0; i < taille; i++) {
            System.out.println(tableau1[i] + " ");
        }

        System.out.println("\n\nTableau 2 :");
        for (int i = 0; i < taille; i++) {
            System.out.println(tableau2[i] + "");
        }
    }
}
