import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */
        System.out.println("Ćw 3");

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        System.out.println("Zad 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("Liczba " + a + " jest parzysta");
                break;
            default:
                System.out.println("Liczba " + a + " jest nieparzysta");
                break;
        }
        switch (a % 7) {
            case 0:
                System.out.println("Liczba " + a + " jest podzielna przez 7");
                break;
            default:
                System.out.println("Liczba " + a + " jest niepodzielna przez 7");
                break;
        }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        System.out.println("Zad 2");
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int b = text.length();
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                case 'p':
                case 'x':
                case 'z':
                case 'q':
                    b--;
                    break;
            }
        }
        System.out.println("Ilość liter które nie należą do : 'o', 'p', 'x', 'z', 'q' wynosi : " + b);

    }
}
