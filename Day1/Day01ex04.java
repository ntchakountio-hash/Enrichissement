
import java.util.Scanner;

public class Day01ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demande la note
        System.out.print("Entre la note de l'élève en maths (sur 100) : ");
        double note = sc.nextDouble();

        // Vérifie la réussite
        if (note >= 60) {
            System.out.println("L'élève a réussi son cours de maths");
        } else {
            System.out.println("L'élève a échoué son cours de maths");
        }

        sc.close();
    }
}
