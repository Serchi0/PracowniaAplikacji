
void main() {
    Scanner scanner = new Scanner(System.in);
    //zadania tablice
    //zadanie 1
    int[] liczby = {10, 20, 30, 40, 50, 60};
    String[] imiona = {"Adam", "Ola", "Kuba", "Ania", "Tomek"};

    System.out.println("Co drugi element pierwszej tablicy:");

    for (int i = 0; i < liczby.length; i += 2) {
        System.out.println(liczby[i]);
    }

    System.out.println("Co drugi element drugiej tablicy:");

    for (int i = 0; i < imiona.length; i += 2) {
        System.out.println(imiona[i]);
    }
    //zadanie 2
    int[] liczby2 = {12, 5, 87, -3, 41, 29};

    int max = liczby2[0];

    for (int i = 1; i < liczby2.length; i++) {
        if (liczby2[i] > max) {
            max = liczby2[i];
        }
    }

    System.out.println("Najwieksza liczba: " + max);
    //zadanie 3
    String[] slowa = {"ala", "ma", "kota", "java", "programowanie"};

    for (String slowo : slowa) {
        System.out.println(slowo.toUpperCase());
    }
    //zadanie 4
    String[] slowa2 = new String[5];

    for (int i = 0; i < slowa2.length; i++) {
        System.out.print("Podaj slowo " + (i + 1) + ": ");
        slowa2[i] = scanner.next();
    }

    System.out.println("Slowa od konca:");

    for (int i = slowa2.length - 1; i >= 0; i--) {
        for (int j = slowa2[i].length() - 1; j >= 0; j--) {
            System.out.print(slowa2[i].charAt(j));
        }

        System.out.println();
    }
    //zadanie 5
    int[] liczby3 = new int[8];

    for (int i = 0; i < liczby3.length; i++) {
        System.out.print("Podaj liczbe " + (i + 1) + ": ");
        liczby3[i] = scanner.nextInt();
    }

    for (int i = 0; i < liczby3.length - 1; i++) {
        for (int j = 0; j < liczby3.length - 1 - i; j++) {

            if (liczby3[j] > liczby3[j + 1]) {
                int temp = liczby3[j];
                liczby3[j] = liczby3[j + 1];
                liczby3[j + 1] = temp;
            }
        }
    }

    System.out.println("Liczby posortowane rosnaco:");

    for (int liczba : liczby3) {
        System.out.print(liczba + " ");
    }
    //zadanie 6
    int[] liczby4 = new int[5];

    for (int i = 0; i < liczby4.length; i++) {
        System.out.print("Podaj liczbe nieujemna (0-20): ");
        liczby4[i] = scanner.nextInt();

        if (liczby4[i] < 0 || liczby4[i] > 20) {
            System.out.println("Liczba musi byc z zakresu 0-20.");
            return;
        }
    }

    for (int i = 0; i < liczby4.length; i++) {
        long silnia = 1;

        for (int j = 1; j <= liczby4[i]; j++) {
            silnia *= j;
        }

        System.out.println("Silnia liczby " + liczby4[i] + " = " + silnia);
    }
    //zadanie 7
    String[] tablica1 = {"Ala", "ma", "kota"};
    String[] tablica2 = {"Ala", "ma", "kota"};

    if (Arrays.equals(tablica1, tablica2)) {
        System.out.println("Tablice sa takie same.");
    } else {
        System.out.println("Tablice sa rozne.");
    }
    //zadanie 8
    //noi jak tradycja juz nakazuje dalsze postepy w tym kodzie zostana moze kiedys przeslane





}
