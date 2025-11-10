package ngamina.Day2;

import java.util.Scanner;

public class Day02ex12 {

    // 🔹 Méthode qui calcule la somme des nombres entre min et max inclus
    public static int sommeMinMax(int min, int max) {
        int somme = 0;
        for (int i = min; i <= max; i++) {
            somme += i;
        }
        return somme;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min, max;

        // Demande et validation
        do {
            System.out.print("Entrer le minimum : "); // Demander à l'utilisateur le premier nombre
            min = sc.nextInt(); // Lire le premier nombre

            System.out.print("Entrer le maximum : "); // Demander à l'utilisateur le deuxième nombre
            max = sc.nextInt(); // Lire le deuxième nombre

            if (max <= min) {
                System.out.println("Le maximum doit être plus grand que le minimm. Réessayez.");
            }

        } while (max <= min);

        // Calcul avec la méthode
        int resultat = sommeMinMax(min, max);

        System.out.print("La somme est de : ");
        for (int i = min; i <= max; i++) {
            System.out.print(i);
            if (i < max) {
                System.out.print(" + ");
                
            }
            }
            System.out.println(" = " + resultat);

        sc.close(); // Fermer le scanner

        sllsdldlls
    }
}
