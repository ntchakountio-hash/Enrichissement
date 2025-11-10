package ngamina.Day2;

import java.util.Scanner;

public class Day02ex11 {
    // 🔹 Méthode qui calcule la factorielle d’un entier
    public static long factoriel(int n) {
        long resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;  // ou faire resultat *= 1
        }

        return resultat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = sc.nextInt();

        long fact = factoriel(nombre);

        System.out.println("La factorielle de " + nombre + " est : " + fact);

        sc.close();
    }
}
