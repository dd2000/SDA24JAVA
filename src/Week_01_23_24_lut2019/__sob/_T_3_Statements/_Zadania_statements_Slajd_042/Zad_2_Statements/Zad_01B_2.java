package Week_01_23_24_lut2019.__sob._T_3_Statements._Zadania_statements_Slajd_042.Zad_2_Statements;

public class Zad_01B_2 {
/*
    Napisz program, który wypisze na ekran konsoli
    słowo oznaczające ocenę dla podanej cyfry:
    np. dla 1 - "niedostateczny", 2 - "dopuszczający" itp.
    Obsłuż przypadek gdy cyfra jest poza skalą ocen.
*/

    public static void main(String[] args){
        // write your code here

        int ocena = 3;

        System.out.print("\nStopień (cyfrą) "+ocena+" to (słownie): ");

        switch (ocena) {
            case 1:
                System.out.println("niedostateczny.");
                break;
            case 2:
                System.out.println("dopuszczający.");
                break;
            case 3:
                System.out.println("dostateczny.");
                break;
            case 4:
                System.out.println("dobry.");
                break;
            case 5:
                System.out.println("bardzo dobry.");
                break;
            case 6:
                System.out.println("celujący.");
                break;
            default:
                System.out.println("Nie ma takiego stopnia w skali ocen.");
        } //switch
    } // main

}  //class Week_01_23_24_lut2019.__sob._T_3_Statements._Zadania_statements_Slajd_042.Zad_2_Statements.Zad_01B_2

