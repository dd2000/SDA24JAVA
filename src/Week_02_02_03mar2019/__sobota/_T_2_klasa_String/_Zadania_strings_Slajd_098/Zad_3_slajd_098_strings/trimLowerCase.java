package Week_02_02_03mar2019.__sobota._T_2_klasa_String._Zadania_strings_Slajd_098.Zad_3_slajd_098_strings;

/*
Napisz metodę, która jako argument otrzyma jedną zmienną typu String,
usunie z niej białe znaki z początku i końca tekstu oraz zamieni wszystkie litery na małe.
*/


public class trimLowerCase {

    static String trimLower(String txt){
        return txt.trim().toLowerCase();
    }  //String trimLower



    public static void main(String[] args) {
        String text = "         Mała ALA MA wielkiego KOTKA!       ";
        System.out.println(trimLower(text)+"<<== koniec text(u)");

    }  //main


}  // Zad_03_trim_lowerCase
