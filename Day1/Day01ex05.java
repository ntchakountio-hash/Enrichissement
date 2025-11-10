
import java.util.Scanner;

public class Day01ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demande le montant à l'utilisateur
        System.out.print("Entre le montant avant rabais : ");
        double montant = sc.nextDouble();

        // Calcul du rabais de 25 %
        double montantRabais = montant * 0.75; // ou montant - (montant * 0.25)

        // Affiche le résultat
        System.out.println("Le montant après un rabais de 25% est : " + montantRabais + " $");

        sc.close();
    }
}
