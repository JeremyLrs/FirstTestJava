import java.util.Scanner;

public class Convertisseur {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== CONVERTISSEUR D'UNITÉS ==========");
        System.out.println();

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bonjour " + nom + "!");

        System.out.print("Entrez une distance en Km : ");
        double kilometres = scanner.nextDouble();
        double miles = kilometres * 0.621371;
        System.out.println(kilometres + " Km = " + miles + " miles");

        System.out.print("Entrez une temperature en celsius : ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32 ;
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        scanner.close();
    }
}