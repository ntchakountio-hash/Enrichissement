package ngamina.Day2;

import java.util.Scanner;

public class Day02ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valeur;

        // Boucle do...while
        do {
            System.out.print("Entre une valeur entre 0 et 100 : ");
            valeur = sc.nextInt();

            if (valeur < 0 || valeur > 100) {
                System.out.println("⚠️ Valeur invalide, recommence !");
            }

        } while (valeur < 0 || valeur > 100);

        System.out.println("✅ Valeur acceptée : " + valeur);

        sc.close();
    }
}
