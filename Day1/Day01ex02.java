package ngamina.Day1;


import java.util.Scanner;

public class Day01ex02 {
    public static void main(String[] args) {
        // Création de l'objet Scanner pour lire les entrées utilisateur
        Scanner sc = new Scanner(System.in);
        
        // Demander le salaire horaire
        System.out.print("Entrez le salaire horaire de l'employé (en euros) : ");
        double salaireHoraire = sc.nextDouble();  // Lire le salaire horaire

        // Demander le nombre d'heures travaillées par semaine
        System.out.print("Entrez le nombre d'heures travaillées par semaine : ");
        double heuresParSemaine = sc.nextDouble();  // Lire le nombre d'heures travaillées

        // Calcul du salaire hebdomadaire
        double salaireHebdomadaire = salaireHoraire * heuresParSemaine;

        // Calcul du salaire pour la quinzaine (15 jours)
        double salaireQuinzaine = salaireHebdomadaire * 2;

        // Affichage du résultat
        System.out.println("Le salaire pour la quinzaine de l'employé est de : " + salaireQuinzaine + " euros.");

        // Fermeture du scanner
        sc.close();
    }
}

