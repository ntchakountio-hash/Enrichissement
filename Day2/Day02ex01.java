package ngamina.Day2;

import java.util.Scanner;

public class Day02ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Afficher les informations du client
        System.out.print("Entrez du texte : ");
        String TextMaj = sc.nextLine();

        String majuscules = TextMaj.toUpperCase();

        System.out.println("En majuscules : " + majuscules);

        sc.close(); // Fermer le scanner
    }
}
