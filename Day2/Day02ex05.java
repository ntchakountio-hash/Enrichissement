
public class Day02ex05 {
    public static void main(String[] args) {
        // Afficher l'alphabet à l'endroit
        System.out.println("Alphabet à l'endroit :");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }

        System.out.println(); // passage à la ligne

        // Afficher l'alphabet à l'envers
        System.out.println("Alphabet à l'envers :");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
    }
}
