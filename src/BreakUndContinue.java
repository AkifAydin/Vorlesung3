public class BreakUndContinue {
    public static void main(String[]
                                    args) {
        for (int i = 0; i < 100; i++) {
            //System.out.println(i); letzte Zahl vor Beendung
            if (i == 67)
                break;
            if (i % 9 != 0)
                continue;
            System.out.print(i + " ");

        }

    }
}