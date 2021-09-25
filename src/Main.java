import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */
        System.out.println("Ćw 2");

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        System.out.println("Zad 1");
        int x = 0;
        for (int i = 0; i < 100; i++) {
            if (i%3==0){
                System.out.println(i);
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        System.out.println("Zad 2");
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[5];
        for (int zmienna : tab){
            System.out.println("Podaj liczbę do tablicy ");
            zmienna = scanner.nextInt();
            System.out.println(zmienna);
            System.out.println(zmienna + 11);
        }
    }
}
