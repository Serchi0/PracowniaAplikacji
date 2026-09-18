//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {


            System.out.println("Ania");
            System.out.println("Bartek");
            System.out.println("Kasia");

            // Zad. 2
            String imie = "Sergiusz";
            int rokUrodzenia = 2007;
            double liczba = 0.66;

            // Zad. 3
            int obecnyRok = 2026;
            int wiek = obecnyRok - rokUrodzenia;

            System.out.println("Mam na imię " + imie + ", mam " + wiek
                + " lat i będę pisać maturę za " + liczba + " roku.");

            // Zadanie 4
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj temperaturę w Celsjuszach: ");
            double stopnie = scanner.nextDouble();
            double fahrenheit = 1.8 * stopnie + 32.0;
            System.out.println("Temperatura w Fahrenheitach: " + fahrenheit);

            // Zad 5
            System.out.println("Podaj dlugosc boku a");
            int bokA = scanner.nextInt();
            System.out.println("Podaj dlugosc boku b");
            int bokB = scanner.nextInt();
            System.out.println("Podaj dlugosc boku c");
            int bokC = scanner.nextInt();
            int obwod= bokA+bokB+bokC;
            System.out.println("Obwod trojkata jest rowny:" +obwod);













        }


