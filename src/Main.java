import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */
        System.out.println("Ćw 6");
        Scanner scanner = new Scanner(System.in);
        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        System.out.println("Zad 1");
        List<String> lista1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj nazwę zwierzęcia");
            lista1.add(scanner.next());
        }
        wypiszListe(lista1);

        lista1.remove(lista1.size()-1);
        lista1.remove(lista1.size()-1);

        lista1.add("Myszoskoczek");
        lista1.add("Bażant");
        lista1.add("Kuropatwa");

        wypiszListe(lista1);

        Collections.reverse(lista1);

        wypiszListe(lista1);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        System.out.println("\nZad 2");

        Set<Integer> lista2 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            lista2.add(scanner.nextInt());
        }
        wypiszListe2(lista2);

    }
    public static void wypiszListe(List<String> lista){
        for(String zmienna : lista){
            System.out.println(zmienna);
        }
    }
    public static void wypiszListe2(Set<Integer> lista){
        for(int zmienna : lista){
            System.out.println(zmienna);
        }
    }

}
