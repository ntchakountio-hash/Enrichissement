package ngamina.Day1;

import java.util.Scanner;

public class Day01ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander les âges à l'utilisateur
        System.out.print("Entre l'âge de la première personne : ");
        int age1 = sc.nextInt();

        System.out.print("Entre l'âge de la deuxième personne : ");
        int age2 = sc.nextInt();

        // Calcul de la moyenne
        double moyenne = (age1 + age2) / 2.0;

        // Détermination du plus vieux
        int plusVieux = (age1 > age2) ? age1 : age2;

        // Affichage des résultats
        System.out.println("\nLa moyenne d'âge est de : " + moyenne + " ans");
        System.out.println("L'âge de la personne la plus vieille est : " + plusVieux + " ans");

        sc.close();
    }
}
