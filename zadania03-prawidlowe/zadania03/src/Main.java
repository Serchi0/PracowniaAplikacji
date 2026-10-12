//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    Scanner scanner = new Scanner(System.in);
    //zadania petle
    // ZADANIE 1
    System.out.print("Podaj liczbe calkowita dodatnia: ");
    int n1 = scanner.nextInt();

    for (int i1 = 1; i1 <= n1; i1 += 2) {
        System.out.print(i1 + " ");
    }
    System.out.println();


    // ZADANIE 2
    System.out.print("Podaj liczbe dodatnia: ");
    int n2 = scanner.nextInt();

    int potega2 = 1;

    while (potega2 <= n2) {
        System.out.println(potega2);
        potega2 *= 2;
    }


    // ZADANIE 3
    int liczba3;
    int suma3 = 0;

    do {
        System.out.print("Podaj liczbe (0 konczy): ");
        liczba3 = scanner.nextInt();

        suma3 += liczba3;

    } while (liczba3 != 0);

    System.out.println("Suma: " + suma3);


    // ZADANIE 4
    System.out.print("Podaj liczbe (0 konczy): ");
    int liczba4 = scanner.nextInt();

    if (liczba4 == 0) {
        System.out.println("Nie podano zadnych liczb.");
    } else {
        int min4 = liczba4;
        int max4 = liczba4;
        int suma4 = 0;
        int ile4 = 0;

        while (liczba4 != 0) {
            suma4 += liczba4;
            ile4++;

            if (liczba4 < min4) {
                min4 = liczba4;
            }

            if (liczba4 > max4) {
                max4 = liczba4;
            }

            System.out.print("Podaj kolejna liczbe (0 konczy): ");
            liczba4 = scanner.nextInt();
        }

        System.out.println("Najmniejsza liczba: " + min4);
        System.out.println("Najwieksza liczba: " + max4);
        System.out.println("Suma min i max: " + (min4 + max4));
        System.out.println("Srednia arytmetyczna: " + (double) suma4 / ile4);
    }


    // ZADANIE 5
    Random random5 = new Random();

    int wylosowana5 = random5.nextInt(100) + 1;
    int liczba5;

    do {
        System.out.print("Zgadnij liczbe od 1 do 100: ");
        liczba5 = scanner.nextInt();

        if (liczba5 > wylosowana5) {
            System.out.println("Podales za duza wartosc.");
        } else if (liczba5 < wylosowana5) {
            System.out.println("Podales za mala wartosc.");
        } else {
            System.out.println("Gratulacje!");
        }

    } while (liczba5 != wylosowana5);


    // ZADANIE 6
    System.out.print("Podaj x: ");
    int x6 = scanner.nextInt();

    System.out.print("Podaj y: ");
    int y6 = scanner.nextInt();

    System.out.print("Podaj szerokosc a: ");
    int a6 = scanner.nextInt();

    System.out.print("Podaj wysokosc b: ");
    int b6 = scanner.nextInt();

    System.out.print("Podaj znak wypelnienia: ");
    char znak6 = scanner.next().charAt(0);

    if (x6 < 1 || y6 < 1 || a6 < 1 || b6 < 1) {
        System.out.println("Podaj dodatnie wspolrzedne i wymiary.");
    } else {
        for (int i6 = 1; i6 < y6; i6++) {
            System.out.println();
        }

        for (int j6 = 0; j6 < b6; j6++) {
            for (int k6 = 1; k6 < x6; k6++) {
                System.out.print(" ");
            }

            for (int l6 = 0; l6 < a6; l6++) {
                System.out.print(znak6);
            }

            System.out.println();
        }
    }
    //ZADANIE 7
    System.out.print("Podaj wysokosc choinki: ");
    int n = scanner.nextInt();

    if (n <= 0) {
        System.out.println("Wysokosc musi byc dodatnia.");
        return;
    }

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
    //ZADANIE 8
    System.out.print("Podaj liczbe calkowita nieujemna (0-20): ");
    int S = scanner.nextInt();

    if (S < 0 || S > 20) {
        System.out.println("Podaj liczbe z zakresu 0-20.");
        return;
    }

    long silnia = 1;

    for (int i = 1; i <= n; i++) {
        silnia *= i;
    }

    System.out.println("Silnia liczby " + n + " wynosi: " + silnia);
    //ZADANIE 9
    //eeee kiedys mozna pomyslec nad doslaniem ich 
}
