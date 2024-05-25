import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exemplul2 {

    /*
     1. Scrie o metoda care calculeaza media(), care primeste 5 parametrii de tip double si afiseaza textul
     "Media numerelor este.. "
     Apeleaza de 3 ori  metoda cu valori diferite;

     2. Scrie o metoda aduna() care primeste 3 parametrii de tip int si returneaza suma numerelor;
     Apeleaza metoda de 3 ori cu valori diferite;

     3. Scrie o metoda care returneaza cel mai mic numar dintr-o lista de tip double pasat ca parametru;

     4. Declara o metoda addStrings(), care primeste 5 parametrii de tip String si returneaza o lista care contine
     acesti parametrii
     Apeleaza metoda si afiseaza lista sortata alfabetic;

     5. Scrie o metoda care se cheama convertToCelsius() care primeste un paramatru de tip int fahrenheit si afiseaza
     "Temperatura in grade Celsius este: "
     Apeleaza metoda de 3 ori cu valori diferite


     */

    public static void main(String[] args) {

        media(22.55,  45.90, 16.76, 10.26, 24.82);
        media(21.45,  95.60, 19.72, 18.69, 54.02);
        media(29.85,  40.68, 11.89, 13.06, 27.92);

        System.out.println(aduna(23, 15, 10));
        System.out.println(aduna(23, 15, -10));
        System.out.println(aduna(19, 10, -29));

        ArrayList<Double> listaNumere = new ArrayList<>(Arrays.asList(4.5, 56.78, -20.56, 9.78,-100.45, -45.21));
        double listaDeMaiSus = celMaiMicNumar(listaNumere);
        System.out.println(listaDeMaiSus);

        ArrayList<String> listaStrings = addStrings("Alex", "Marian", "Diana", "Costelus", "George");
        Collections.sort(listaStrings);
        System.out.println("Lista afisata si sortata este: " + listaStrings );

        convertToCelsius(92);
        convertToCelsius(58);
        convertToCelsius(80);

    }






    // 1. Scrie o metoda care calculeaza media(), care primeste 5 parametrii de tip double si afiseaza textul
    //     "Media numerelor este.. "
    //     Apeleaza de 3 ori  metoda cu valori diferite;

    public static void media(double x, double y, double z, double u, double w) {
        double mediaNumerelor = ( x + y + z + u + w)/5;
        System.out.printf("Media numerelor este: %.2f\n", mediaNumerelor);

    }

    // 2. Scrie o metoda aduna() care primeste 3 parametrii de tip int si returneaza suma numerelor;
    //     Apeleaza metoda de 3 ori cu valori diferite;

    public static int aduna(int x, int y, int z) {
        int suma = x + y +z;
        return suma ;

    }

    // 3. Scrie o metoda care returneaza cel mai mic numar dintr-o lista de tip double pasat ca parametru;

    public static double celMaiMicNumar(ArrayList<Double> numereCuZecimale) {
        double celMaiMic = Double.MIN_VALUE;
        for (double numarCuZecimale: numereCuZecimale) {
            if (numarCuZecimale < celMaiMic) {
                celMaiMic = numarCuZecimale;
            }

        }
        return celMaiMic;
    }

    // 4. Declara o metoda addStrings(), care primeste 5 parametrii de tip String si returneaza o lista care contine
    //     acesti parametrii
    //     Apeleaza metoda si afiseaza lista sortata alfabetic;



       public static ArrayList<String> addStrings(String nume1, String nume2, String nume3, String nume4, String nume5) {
        ArrayList<String> stringList = new ArrayList<>();
       stringList.add(nume1);
       stringList.add(nume2);
       stringList.add(nume3);
       stringList.add(nume4);
       stringList.add(nume5);
           return stringList;
    }





    // 5.  Scrie o metoda care se cheama convertToCelsius() care primeste un paramatru de tip int fahrenheit si afiseaza
    //     "Temperatura in grade Celsius este: "
    //     Apeleaza metoda de 3 ori cu valori diferite


    public static void convertToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf ("Temperatura in grade Celsius este: %.2f\n", celsius);
    }





}
