
import java.util.Scanner;

public class Day02ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander une phrase
        System.out.print("Entrez une phrase : ");
        String Phrase = sc.nextLine();

        int voyelles = 0;
        int consonnes = 0;

        // Convertir en minuscules pour simplifier la vérification
        String texte = Phrase.toLowerCase();

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);

            // Vérifier si c'est une lettre
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                    voyelles++;
                } else {
                    consonnes++;
                }

            }

        }

        // Afficher les résultats
        System.out.println("\nNombre de voyelles : " + voyelles);
        System.out.println("\nNombre de consonnes : " + consonnes);

        sc.close();

    }

}