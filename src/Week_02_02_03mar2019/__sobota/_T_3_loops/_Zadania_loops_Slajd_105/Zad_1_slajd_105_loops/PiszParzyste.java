package Week_02_02_03mar2019.__sobota._T_3_loops._Zadania_loops_Slajd_105.Zad_1_slajd_105_loops;

/*
Napisz metodę, która wyświetli na ekranie n-pierwszych liczb parzystych.
Zmienna n to parametr metody. Czyli np. dla n = 4 program powinien wypisać: 2, 4, 6, 8
*/


public class PiszParzyste {

    public static void piszParzyste(int ile){
        for (int i=1; i<=ile; i++)
            System.out.print(2*i + " ");
    }  //piszParzyste


    public static void main(String[] args) {
        int n=7;  // ilość wypisywanych kolejnych liczb parzystych
        piszParzyste(n);
    }  // main

}  // Zad_01_piszParzyste class
