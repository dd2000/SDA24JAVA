package Week_02_02_03mar2019.__sobota._T_3_loops._Zadania_loops_Slajd_105.Zad_2_slajd_105_loops;

/*
    Napisz metodę, która policzy n-tą potęgę (n >= 0) liczby całkowitej a.
    Parametry metody to: n i a.
*/

public class Potegowanie {

    public static long potegowanie(int podstawa, int wykladnik){
        long potega = 1L;
        for (int i=1; i<=wykladnik; i++)
            potega = potega * podstawa;
        return potega;
    }  //potegowanie

    public static void main(String[] args) {
        int a= 5;  // podstawa
        int n= 3;  // wykładnik potęgi a^n
        System.out.println("\n"+a+" do potegi "+n+" daje: "+potegowanie(a,n));
    } //main

} // potegowanie class
