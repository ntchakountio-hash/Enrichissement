
import java.util.Scanner;

public class Day02ex08 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String mot;
    String premier = null;
    String dernier = null;

    System.out.println("Entrez des mots ('stop' pour arrêter) :");

    do {
            System.out.print("Mot : ");
            mot = sc.nextLine();

            // Ignorer le mot "stop"
            if (!mot.equalsIgnoreCase("stop")) {
                // Initialisation si c'est le premier mot
                if (premier == null) {
                    premier = mot;
                    dernier = mot;
                } else {
                    // Comparaison alphabétique sans tenir compte des majuscules
                    if (mot.compareToIgnoreCase(premier) < 0) {
                        premier = mot;
                    }
                    if (mot.compareToIgnoreCase(dernier) > 0) {
                        dernier = mot;
                    }
                }
            }

        } while (!mot.equalsIgnoreCase("stop"));

        System.out.println("\n=== Résultats ===");
        if (premier != null && dernier != null) {
            System.out.println("Premier mot (ordre alphabétique) : " + premier);
            System.out.println("Dernier mot (ordre alphabétique) : " + dernier);
        } else {
            System.out.println("Aucun mot saisi.");
        }

        sc.close();
    }
}
