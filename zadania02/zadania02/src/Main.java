
void main() {
    //zadania instrukcje warunkowe

    //zadanie1
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj liczbe: ");
    int liczba = scanner.nextInt();

    if (liczba % 3 == 0) {
        System.out.println("Liczba jest podzielna przez 3");
    } else {
        System.out.println("Liczba nie jest podzielna przez 3");
    }
    //zadanie2
    System.out.print("Podaj pierwszy bok: ");
    double a = scanner.nextDouble();

    System.out.print("Podaj drugi bok: ");
    double b = scanner.nextDouble();

    System.out.print("Podaj trzeci bok: ");
    double c = scanner.nextDouble();

    if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
        System.out.println("trojkat jest wykonalny");
    } else {
        System.out.println("trojkat jest niewykonalny");
    }
    //zadanie3
    System.out.print("Podaj pierwsza liczbe: ");
    double a = scanner.nextDouble();

    System.out.print("Podaj druga liczbe: ");
    double b = scanner.nextDouble();

    if (a > b) {
        System.out.println("Najwieksza liczba to: " + a);
    } else if (b > a) {
        System.out.println("Najwieksza liczba to: " + b);
    }
    //zadanie4
    System.out.print("Podaj pierwsza liczbe: ");
    double a = scanner.nextDouble();

    System.out.print("Podaj druga liczbe: ");
    double b = scanner.nextDouble();

    System.out.print("Podaj trzecia liczbe: ");
    double c = scanner.nextDouble();

    double max = a;

    if (b > max) {
        max = b;
    }

    if (c > max) {
        max = c;
    }

    System.out.println("Najwieksza liczba to: " + max);
    //zadanie5
    System.out.print("Podaj numer miesiaca (1-12): ");
    int miesiac = scanner.nextInt();

    switch (miesiac) {
        case 1:
            System.out.println("Styczen");
            break;
        case 2:
            System.out.println("Luty");
            break;
        case 3:
            System.out.println("Marzec");
            break;
        case 4:
            System.out.println("Kwiecien");
            break;
        case 5:
            System.out.println("Maj");
            break;
        case 6:
            System.out.println("Czerwiec");
            break;
        case 7:
            System.out.println("Lipiec");
            break;
        case 8:
            System.out.println("Sierpien");
            break;
        case 9:
            System.out.println("Wrzesien");
            break;
        case 10:
            System.out.println("Pazdziernik");
            break;
        case 11:
            System.out.println("Listopad");
            break;
        case 12:
            System.out.println("Grudzien");
            break;
        default:
            System.out.println("Nieprawidlowy numer miesiaca");
    }
    //zadanie6
    System.out.print("Podaj swoje imie: ");
    String imie = scanner.nextLine();

    if (imie.equals("Sergiusz")) {
        System.out.println("Masz takie samo imie jak ja.");
    } else {
        System.out.println("Masz inne imie niz ja.");
    }
    //zadanie7
    System.out.print("Podaj swoj wiek: ");
    int wiek = scanner.nextInt();

    boolean pelnoletni = wiek >= 18 ? true : false;

    System.out.println(pelnoletni);
    //zadanie8
    System.out.print("Podaj rok: ");
    int rok = scanner.nextInt();

    if (rok % 400 == 0 ||
            (rok % 4 == 0 && rok % 100 != 0)) {
        System.out.println("Rok jest przestepny.");
    } else {
        System.out.println("Rok nie jest przestepny.");
    }
    //zadanie9
    System.out.print("Podaj wage w kg: ");
    double waga = scanner.nextDouble();

    System.out.print("Podaj wzrost w metrach: ");
    double wzrost = scanner.nextDouble();

    if (waga <= 0 || wzrost <= 0) {
        System.out.println("Nieprawidlowe dane.");
        return;
    }

    double bmi = waga / (wzrost * wzrost);

    System.out.printf("BMI: %.2f%n", bmi);

    if (bmi < 18.5) {
        System.out.println("Niedowaga");
    } else if (bmi <= 24.9) {
        System.out.println("Waga prawidlowa");
    } else {
        System.out.println("Nadwaga");
    }
    //zadanie10
    double cena;
    int raty;

    do {
        System.out.print("Podaj cene towaru (100-10000 zl): ");
        cena = scanner.nextDouble();

        if (cena < 100 || cena > 10000) {
            System.out.println("Nieprawidlowa cena");
        }
    } while (cena < 100 || cena > 10000);

    do {
        System.out.print("Podaj liczbe rat (6-48): ");
        raty = scanner.nextInt();

        if (raty < 6 || raty > 48) {
            System.out.println("Nieprawidlowa liczba rat");
        }
    } while (raty < 6 || raty > 48);

    double oprocentowanie;

    if (raty <= 12) {
        oprocentowanie = 0.025;
    } else if (raty <= 24) {
        oprocentowanie = 0.05;
    } else {
        oprocentowanie = 0.10;
    }

    double cenaCalkowita = cena * (1 + oprocentowanie);
    double rata = cenaCalkowita / raty;

    System.out.printf("Cena z odsetkami: %.2f zl%n", cenaCalkowita);
    System.out.printf("Miesieczna rata: %.2f zl%n", rata);
    }
    //zadanie11
    //moze kiedys ten kalkulator tu zawita jak narazie moge zaproponowac link do kalkulatora online https://www.desmos.com/scientific?lang=pl


}
