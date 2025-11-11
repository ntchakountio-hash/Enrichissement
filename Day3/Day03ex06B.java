import java.util.Random;

public class Day03ex06B {
  public static void main(String[] args) {

        // 🔹 Taille du tableau
        int taille = 10;

        // 🔹 Déclaration du tableau
        int[] nombres = new int[taille];

        // 🔹 Création d’un générateur de nombres aléatoires
        Random random = new Random();

        // 🔹 Variables pour stocker les sommes
        int sommePositifs = 0;
        int sommeNegatifs = 0;

        // 🔹 Remplir le tableau avec des valeurs aléatoires entre -100 et 100
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = random.nextInt(201) - 100; 
            // random.nextInt(201) donne 0 à 200 → -100 donne -100 à 100
        }

        // 🔹 Afficher le tableau
        System.out.print("Tableau généré : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println();

         // 🔹 Parcourir le tableau et calculer les sommes
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] > 0) {
                sommePositifs += nombres[i];
            } else {
                sommeNegatifs += nombres[i];
            }

        }

          // 🔹 Affichage des résultats
        System.out.println("Somme des éléments positifs : " + sommePositifs);
        System.out.println("Somme des éléments négatifs : " + sommeNegatifs);
    }
}

