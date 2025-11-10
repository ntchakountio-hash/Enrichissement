import java.util.Scanner;

public class Day02ex13 {

    // Methode pour convertir celsius --> Fahrenheit
    public static double celsiusVersFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
}

// Methode pour convertir Fahrenheit --> Celsius
    public static double FahrenheitVersCelsius(double Fahrenheit) {
        return (Fahrenheit - 32) * 5/9;
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperatures ===");
        System.out.println("1. Celsius");
        System.out.println("2. Fahreinheit");
        System.out.print("Choisissez le type de temperature (1 ou 2) : ");
        int choix = sc.nextInt();

        if (choix == 1) {
            System.out.print("Entrer la temperature en Celcius : ");
            double tempC = sc.nextDouble();
            double resultat = celsiusVersFahrenheit(tempC);
            System.out.print(tempC + "°C = " + resultat + " °F ");
        }
        else if (choix == 2) {
             System.out.print("Entrer la temperature en Fahrenheit : ");
            double tempF = sc.nextDouble();
            double resultat = FahrenheitVersCelsius(tempF);
            System.out.print(tempF + "°F = " + resultat + " °C ");
        }
        else {
            System.out.println(("Choix invalide ! vous devez entrer '1' ou '2'. "));
        }

        sc.close(); // Fermer le scanner



}


}

