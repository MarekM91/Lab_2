public class Main {

    public static void main(String[] args) {

        /* cw.4  */
        System.out.println("Ćw 4");

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        for (int i = 0; i < 100; i++) {
            if (i == 15) {
                break;
            }
        }
        for (int i = 0; i < 100; i++) {
            if (i == 30) {
                continue;
            }
        }
        for (int i = 0; i < 100; i++) {
            if (i == 25) {
                return;
            }
        }
    }
}
