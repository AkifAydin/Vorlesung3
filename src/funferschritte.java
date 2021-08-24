import java.util.ArrayList;
import java.util.Random;

public class funferschritte {

    public static void ueb1() {
        for (int i = 1; i < 100; i++) {
            if (i % 5 != 0)
                continue;
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public static void ueb2(int wert) {
        for (long i = 2; i < wert; i++) {
            if (wert % i == 0) {
                System.out.println("kein Prim");
                break;
            } else if (wert == i + 1) {

                System.out.println("Der Wert: " + wert + "ist eine Primzahl.");
            }
        }
        //System.out.println(wert);;
    }

    public static void ueb3() {
        Random rand = new Random();
        int[] liste = new int[25];
        for (int i = 0; i < 25; i++) {
            liste[i] = rand.nextInt();
            System.out.println("Wert" + i + ": " + liste[i]); //mein array
        }
        for (int n = 1; n < 25; n++) {
            if (liste[0] < liste[n]) System.out.println(liste[0] + " ist kleiner als " + liste[n]);
            else if (liste[0] > liste[n]) System.out.println(liste[0] + " ist größer als " + liste[n]);
            else System.out.println(liste[0] + " = " + liste[n]);
        }
    }

    public static void ueb3ohnearray() {
        Random rand = new Random();
        int ersterwert = rand.nextInt();
        for (int i = 1; i < 25; i++) {
            int aktuellerwert = rand.nextInt();
            if (ersterwert < aktuellerwert) System.out.println(ersterwert + " ist kleiner als " + aktuellerwert);
            else if (ersterwert > aktuellerwert) System.out.println(ersterwert + " ist größer als " + aktuellerwert);
            else System.out.println(ersterwert + " = " + aktuellerwert);
        }
    }

    public static void IfElse3(int source, int begin, int end) {
        if (source >= begin && source <= end) {
            System.out.println("der Wert " + source + " liegt im Intervall zwischen " + begin + " und " + end); //return true
        } else {
            System.out.println("nicht im Intervall");   //return false
        }
    }


    public static void main(String[] args) {
        System.out.println("5er Zahlen Reihe");
        ueb1();
        System.out.println("Primzahlen");
        ueb2(7);
        System.out.println("25RandomZahlenVergleich");
        //ueb3();
        System.out.println("IfElse3");
        IfElse3(5,1,9);
        //ueb3ohnearray();
    }
}
