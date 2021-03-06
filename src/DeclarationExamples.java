public class DeclarationExamples {
    // Deklaration Instanzvariablen
    private Integer numOfExamples;
    private String[] exampleText = { "Instanzvariable numOfExamples", "Parameter von swap val1",
            "Parameter von swap val2", "lokale Variable in swap t1",
            "lokale Variable in swap t2","lokale Variable in swap tmp",
            "lokale Variable in for i"};
    public DeclarationExamples() {
        numOfExamples = 7;
    }
    public void swap(int val1, int val2) { // Deklaration Parameter val1, val2
        int t1; // Deklaration lokale Variable t1
        t1 = val1; // Zuweisung Wert zu t1
        int t2 = val2; // Deklaration und Zuweisung Wert zur lokalen Variablen t2
        System.out.printf("vor dem Tausch t1:%d t2:%d", t1, t2);
        int tmp = t1; // Deklaration lokale Variable für den Tausch
        t1 = t2;
        t2 = tmp;
        System.out.printf("nach dem Tausch t1:%d t2:%d", t1, t2);
    }
    public void howManyDeklarations() {
        for (int i = 0; i < numOfExamples; i++) {
            System.out.printf("Decal %d:%s\n", i, exampleText[i]);
        }
    }

    public static void main(String[] args) {
        DeclarationExamples dec = new DeclarationExamples();
        dec.swap(5,10);
        dec.howManyDeklarations();
    }
}
