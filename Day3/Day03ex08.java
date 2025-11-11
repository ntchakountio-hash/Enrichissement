import java.util.Scanner;

public class Day03ex08 {

    // Méthode pour calculer la moyenne d'une évaluation (TP1, TP2 ou Examen1)
    public static double moyEval(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }

    // Méthode pour calculer la moyenne d'un étudiant (toutes ses évaluations)
    public static double moyEtu(int tp1, int tp2, int exam) {
        return (tp1 + tp2 + exam) / 3.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] noms = { "Pierre", "André", "Julie", "Brigitte", "Anne", "Olivier", "Simon", "Nadine" };
        int[] tp1 = { 65, 78, 43, 82, 76, 91, 71, 96 };
        int[] tp2 = { 45, 55, 67, 89, 100, 95, 92, 81 };
        int[] exam = { 34, 65, 21, 67, 75, 54, 69, 54 };

        // Calcul des moyennes par évaluation
        double moyTP1 = moyEval(tp1);
        double moyTP2 = moyEval(tp2);
        double moyExam = moyEval(exam);

        System.out.println("=== Moyennes par évaluation ===");
        System.out.printf("TP1 : %.2f\n", moyTP1);
        System.out.printf("TP2 : %.2f\n", moyTP2);
        System.out.printf("Examen1 : %.2f\n\n", moyExam);

        // Calcul des moyennes par étudiant
        double[] moyennesEtudiants = new double[noms.length];

        for (int i = 0; i < noms.length; i++) {
            moyennesEtudiants[i] = moyEtu(tp1[i], tp2[i], exam[i]);
        }

        System.out.println("=== Moyennes des étudiants ===");
        for (int i = 0; i < noms.length; i++) {
            System.out.printf("%s : %.2f\n", noms[i], moyennesEtudiants[i]);
        }

        sc.close();
    }
}
