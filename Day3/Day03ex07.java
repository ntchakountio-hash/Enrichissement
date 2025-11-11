import java.util.Random;

public class Day03ex07 {
    public static void main(String[] args) {

        // 🔹 Déclaration du tableau principal (10 cases)
        int[] tableau = new int[10];

        // 🔹 Générateur de nombres aléatoires
        Random random = new Random();

        // 🔹 Remplir le tableau avec des valeurs entre 0 et 4
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(5); // nombres entre 0 et 4
        }

        // 🔹 Afficher le tableau généré
        System.out.print("Tableau généré : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println("\n");

        // 🔹 Nouveau tableau pour stocker le nombre d’occurrences de 0 à 4
        int[] occurrences = new int[5];

        // 🔹 Calcul des occurrences avec la méthode paramétrée
        for (int i = 0; i < occurrences.length; i++) {
            occurrences[i] = compterOccurrences(tableau, i);
        }

        // 🔹 Affichage des occurrences
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println("Le nombre " + i + " apparaît " + occurrences[i] + " fois.");
        }
    }

    // 🔹 Méthode paramétrée pour compter le nombre d’occurrences d’une valeur dans un tableau
    public static int compterOccurrences(int[] tab, int valeur) {
        int compteur = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                compteur++;
            }
        }
        return compteur;
    }

}

