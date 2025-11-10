package ngamina.Day1;

import java.util.Scanner;

public class Day01ex01 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre : ");  // Demander à l'utilisateur le premier nombre
        int a = sc.nextInt();  // Lire le premier nombre
        
        System.out.print("Entrer le deuxième nombre : ");  // Demander à l'utilisateur le deuxième nombre
        int b = sc.nextInt();  // Lire le deuxième nombre

        if (a > b) {  // Si A est plus grand que B
            System.out.println("Le plus grand nombre est : " + a);
        } else {  // Sinon (si B est plus grand ou égal à A)
            System.out.println("Le plus grand nombre est : " + b);
        }

        sc.close();  // Fermer le scanner
    }
}
