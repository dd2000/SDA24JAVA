package Week_02_02_03mar2019.__sobota._T_2_klasa_String._Zadania_strings_Slajd_098.Zad_2_slajd_098_strings;
/*
Napisz metodę, która zwróci tekst: “Simon says: [{text}]”, gdzie {text} - to argument metody.
Użyj konkatenacji lub StringBuildera.
*/

public class SimonSays {

    // metoda konkatenacji lub StringBuildera

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("\n1.Szymon mówi: ");
        String text = "...pocałujta w d... wójta!";
        System.out.println(sb.append(text));   //StringBuilder
        System.out.println( "2.Szymon mówi: ".concat(text));
        System.out.println( "3.Szymon mówi: "+text);  // pus jako operator konkatenacji
    } // main
}  // Zad_02_SimonSays class
