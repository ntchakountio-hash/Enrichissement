package ngamina.Day2;

import java.util.Scanner;

public class Day02ex03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Demander une phrase à l'utilisateur
            System.out.print("Entre une phrase : ");
            String phrase = sc.nextLine();

            // Mettre la phrase en majuscules
            String phraseMaj = phrase.toUpperCase();

            // Compter le nombre de 'A' (après conversion en majuscules)
            int compteurA = 0;
            for (int i = 0; i < phraseMaj.length(); i++) {
                if (phraseMaj.charAt(i) == 'A') {
                    compteurA++;
                }
            }

            // Remplacer tous les 'A' par '$'
            String phraseRemplacee = phraseMaj.replace('A', '$');

            // Afficher les résultats
            System.out.println("\n=== Résultats ===");
            System.out.println("Phrase en majuscules : " + phraseMaj);
            System.out.println("Nombre de 'A' dans la phrase : " + compteurA);
            System.out.println("Phrase après remplacement : " + phraseRemplacee);

            sc.close();
        }
}
