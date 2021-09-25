import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random;

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */
        System.out.println("Ćw 5");
        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        System.out.println("Zad 1");
        int[] tab = metod1(20);
        metod2(tab);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        System.out.println("Zad 2");
        String[] stringTab = metod3(6);
        metod4(stringTab);
        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        System.out.println("Zad 3");
        String imie = "Michał";
        String nazwisko = "Marek";
        int wiek = 30;
        metodImie(imie);
        metodImie(imie, nazwisko);
        metodImie(imie, nazwisko, wiek);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        System.out.println("Zad 4");
        int zmiennaA = dodawanie(1,2);
        int zmiennaB = dodawanie(2,3,4);
        System.out.println("Wynik: " + (dodawanie(1,2) + dodawanie(2,3,4)));


    }

    public static int[] metod1(int zmienna){
        Random random = new Random();
        int[] tab = new int[zmienna];
        for (int i = 0; i < zmienna; i++) {
            tab[i] = random.nextInt(20,40);
        }
        return tab;
    }
    public static void metod2(int[] tab){
        for (int zmienna : tab) {
            System.out.println(zmienna);
        }
    }
    public static String[] metod3(int zmienna){
        String[] stringTab = new String[zmienna];
        for (int i = 0; i < stringTab.length; i++) {
            System.out.println("Podaj wartość " + (i + 1));
            Scanner scanner = new Scanner(System.in);
            stringTab[i] = scanner.next();
        }
        return stringTab;
    }
    public static void metod4(String[] tab){
        for (int i = tab.length; i-- > 0;) {
            System.out.println(tab[i]);
        }
    }
    public static void metodImie(String imie){
        System.out.println("Mam na imię " + imie);
    }
    public static void metodImie(String imie, String nazwisko){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    public static void metodImie(String imie, String nazwisko, int wiek){
        System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat");
    }

    public static int dodawanie(int a, int b){
        return a + b;
    }
    public static int dodawanie(int a, int b, int c){
        return a + b + c;
    }

}
