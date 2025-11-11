public class Day03ex06A {
    public static void main(String[] args) {

        // 🔹 Déclaration du tableau donné
        int[] nombres = { -65, -34, 7, -3, -43, 14, 23, -9, 45, 11 };

        // 🔹 Variables pour stocker les sommes
        int sommePositifs = 0;
        int sommeNegatifs = 0;

        // 🔹 Affichage du tableau
        System.out.print("Tableau : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println(); // saut de ligne

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
