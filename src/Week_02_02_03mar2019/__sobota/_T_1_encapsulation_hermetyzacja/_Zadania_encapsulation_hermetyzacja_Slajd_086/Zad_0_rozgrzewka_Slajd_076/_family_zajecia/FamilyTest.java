package Week_02_02_03mar2019.__sobota._T_1_encapsulation_hermetyzacja._Zadania_encapsulation_hermetyzacja_Slajd_086.Zad_0_rozgrzewka_Slajd_076._family_zajecia;

public class FamilyTest {
    public static void main(String[] args) {
        // utwórz kilka osób (person), rodzine, wypisz o nich informacje
        Person ojciec = new Person("Jan","Kowalski",56,"facet");
        Person matka = new Person("Anna","Kowalska",55,"kobieta");
        Person dziecko = new Person("Krzys","Kowalski", 13,"chłopiec");
        Family rodzina = new Family(ojciec,matka,dziecko);

        System.out.println(rodzina.toString());
    }
}
