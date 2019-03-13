package Week_02_02_03mar2019.__sobota._T_2_klasa_String._Zadania_strings_Slajd_098.Zad_5_slajd_098_strings;

/*
Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String
        i zwróci true jeżeli oba teksty zaczynają się od tego samego znaku.
*/


public class checkFirstChar {

    // metoda porównuje pierwsze znaki łańcuchów str1 i str2
    public static boolean checkFirstChar(String str1, String str2){
        if (str1.substring(0,1).equals(str2.substring(0,1)))
            return true;
        else return false;
    }  // checkFirstChar

    public static void main(String[] args) {
        String txt1="Ala";
        String txt2="algorytm";
        if (checkFirstChar(txt1,txt2))
            System.out.println("\nPierwsze znaki łańcuchów są takie same.");
        else System.out.println("\nPierwsze znaki łańcuchów SĄ INNE.");
    }

} // Zad_05_checkFirstChar
