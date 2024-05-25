public class Exemplul1 {

    /*
    1. Scrie o metoda salut(), care rpimeste ca parametru nume si afiseaza "Ma numesc ..."
    Apeleaza de 3 ori metoda cu nume diferite;

    2. Scrie o metoda comper() care primeste 2 parametri de tip int x, int y, si afiseaza "Numarul... este mai mare"
    Apeleaza metoda de 3 ori cu valori diferite;

    3. Scrie o metoda care primeste ca parametru un numar , si afiseaza la consola "Numarul...este par/impar"

    4. Scrie o metoda care primeste ca parametru un numar , si afiseaza la consola "Numarul...este pozitiv/negativ"

    5. Scrie o metoda care printeaza ( afiseaza la consola ) un text primit ca parametru de 10 ori;


     */


    public static void main(String[] args) {

        salut("Alex");
        salut("Darius");
        salut("George");

        comper(2, 1);
        comper(5, 20);
        comper(-100, -1);

        deComparat(10);
        deComparat(15);
        deComparat(46);

        numarPozitiNegativ(3);
        numarPozitiNegativ(-5);
        numarPozitiNegativ(20);

        numarDe10Ori(10);

    }


    // 1. Scrie o metoda salut(), care rpimeste ca parametru nume si afiseaza "Ma numesc ..."
    //    Apeleaza de 3 ori metoda cu nume diferite;

    public static void salut(String nume) {
        System.out.println("Ma numesc " + nume);

    }

    // 2. Scrie o metoda comper() care primeste 2 parametri de tip int x, int y, si afiseaza "Numarul... este mai mare"
    //    Apeleaza metoda de 3 ori cu valori diferite;

    public static void comper(int x, int y) {

        System.out.println(x > y ? "Numarul " + x + " este mai mare." : "Numarul " + y + " este mai mare.");


    }

    // 3. Scrie o metoda care primeste ca parametru un numar , si afiseaza la consola "Numarul...este par/impar"

    public static void deComparat(int numar) {

        System.out.println(numar % 2 == 0 ? "Numarul " + numar + " este par." : "Numarul " + numar + " este impar.");

    }

    // 4. Scrie o metoda care primeste ca parametru un numar , si afiseaza la consola "Numarul...este pozitiv/negativ"

    public static void numarPozitiNegativ(int numarPoNeg) {

        System.out.println(numarPoNeg < 0  ? "Numarul " + numarPoNeg + " este negativ." : "Numarul " + numarPoNeg +
                " este pozitiv.");

    }

    // 5. Scrie o metoda care printeaza ( afiseaza la consola ) un text primit ca parametru de 10 ori;

    public static void numarDe10Ori(int de10Ori) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(de10Ori);
        }

    }

}
