public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        System.out.println("Zad 1");
        int x = 1000;
        do {
            if (x % 83 == 0){
                System.out.println("Liczba " + x + " jest podielna przez 83");
            }
            x--;
        }while (x >= 0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("Zad 2");

        System.out.println("\na\n");
        int[] tab = {1,2,3,4,5};
        int i = 4;
        while (i >= 0) {
            System.out.println(tab[i]);
            i--;
        }
        System.out.println("\nb\n");
        double[] tab2 = {1.0,2.0,3.0,4.0,5.0};
        int j = 4;
        while (j >= 0) {
            System.out.println(tab2[j]);
            j--;
        }
        System.out.println("\nc\n");
        String[] tab3 = {"M","a","r","e","k"};
        int l = 4;
        while (l >= 0) {
            System.out.println(tab3[l]);
            l--;
        }
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        System.out.println("Zad 3");
        System.out.println("a");
        int number = 32;
        while(true){
            System.out.println("Prawda");
        }
//        while(false){
//            System.out.println("Fałsz");
//
//        }
    }
}
