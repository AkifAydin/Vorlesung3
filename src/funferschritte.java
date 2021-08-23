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
        for (long i = 2; i * i <= wert; i++) {
            if (wert % i == 0) {
                System.out.println("kein Prim");;
            }
        }
        System.out.println(wert);;
    }


    public static void main(String[] args) {
        System.out.println("5er Zahlen Reihe");
        ueb1();
        System.out.println("Primzahlen");
        ueb2(4);
    }
}
