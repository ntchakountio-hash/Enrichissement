public class Day03ex02 {
public static void main(String[] args) {
         
        //Déclaraction d'un tableau de 5 chaînes
        double [] nombres = new double[10];

        //insertion des nombres dans chaque classe
        nombres[0] = 1;
        nombres[1] = 2;
        nombres[2] = 3;
        nombres[3] = 4;
        nombres[4] = 5;
        nombres[5] = 6;
        nombres[6] = 7;
        nombres[7] = 8;
        nombres[8] = 9;
        nombres[9] = 10;

        // Affichage du tablea
        System.out.println("Contenu du tableau : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Case " + i + " : " + nombres[i]);
        }

    }
}
