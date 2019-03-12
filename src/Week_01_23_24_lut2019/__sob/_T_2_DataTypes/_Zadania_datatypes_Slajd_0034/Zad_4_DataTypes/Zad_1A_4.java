package Week_01_23_24_lut2019.__sob._T_2_DataTypes._Zadania_datatypes_Slajd_0034.Zad_4_DataTypes;

public class Zad_1A_4 {
/*
    Napisz program, który utworzy jedną zmienną,
    a następnie wypisze na ekran tekst:
        true jeżeli wartość tej zmiennej jest podzielna przez 3
        i jednocześnie przez 5
    lub false w przeciwnym przypadku.
*/

    public static void main(String[] args){
        // write your code here

        int x=33;
        System.out.println("\nCzy liczba "+x+" jest podzielna przez 3 i jednocześnie przez 5?");
        System.out.println(0 == ((x%3) + (x%5))); //porównuje zero z sumą reszt z dzielenia -> daje true lub false

    } // main

}  //class Week_01_23_24_lut2019.__sob._T_2_datatypes._Zadania_datatypes.Zad_4_DataTypes.Zad_1A_4
