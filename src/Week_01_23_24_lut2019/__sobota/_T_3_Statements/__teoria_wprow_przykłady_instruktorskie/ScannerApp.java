package Week_01_23_24_lut2019.__sobota._T_3_Statements.__teoria_wprow_przykłady_instruktorskie;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String name = scanner.next();

        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("Witaj " + name + " twój wiek to: " + age);
    }
}
