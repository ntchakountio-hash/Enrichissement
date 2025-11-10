
import java.util.Scanner;

public class Day02ex10 {
    public static int plusGrand(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre : "); // Demander à l'utilisateur le premier nombre
        int nb1 = sc.nextInt(); // Lire le premier nombre

        System.out.print("Entrer le deuxième nombre : "); // Demander à l'utilisateur le deuxième nombre
        int nb2 = sc.nextInt(); // Lire le deuxième nombre

        int plusGrand = plusGrand(nb1, nb2);

        System.out.println("Le nombre le plus grand est : " + plusGrand);

        sc.close(); // Fermer le scanner
    }
}
