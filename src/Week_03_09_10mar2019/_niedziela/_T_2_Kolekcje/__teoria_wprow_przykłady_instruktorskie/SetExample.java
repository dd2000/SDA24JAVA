package Week_03_09_10mar2019._niedziela._T_2_Kolekcje.__teoria_wprow_przykłady_instruktorskie;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // z lewej strony zawsze podajemy typ ogolny kolekcji
        // nastepnie w nawiasach ostrych <> typ danych jaki bedzie przetrzymywala nasza kolekcja
        // z prawej strony rownania wybieramy konkretna kolekcje
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        // w przypadku zbioru musimy pamietac, ze wartosci nie beda sie tutaj powtarzac
        System.out.println("Collection size: " + fruits.size());

        // ponizej 2 sposoby na wyswietlanie wszystkich elementow kolekcji typu Set

        // #1 - wykorzystanie obiektu typu Iterator pochodzacego z interfejsu Iterable
        System.out.println("\nPrinting all elements from the collection using `Iterator`");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // #2 - wykorzystanie petli foreach
        System.out.println("\nPrinting all elements from the collection using `for-each` loop");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
