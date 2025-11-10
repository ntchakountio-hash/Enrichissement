
import java.util.Scanner;

public class Day02ex09 {

     // Méthode qui calcule la circonférence d’un cercle
    public static double circonference(int rayon) {
        return 2 * Math.PI * rayon;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander le rayon à l'utilisateur
        System.out.print("Entrez le rayon du cercle (nombre entier) : ");
        int rayon = sc.nextInt();

        double diametre = 2 * rayon;
        // Appeler la méthode pour calculer la circonférence
        double resultat = circonference(rayon);
        

        // Affichage du résultat
        System.out.println("La circonférence du cercle est : " + resultat);

        sc.close();
    }
}
