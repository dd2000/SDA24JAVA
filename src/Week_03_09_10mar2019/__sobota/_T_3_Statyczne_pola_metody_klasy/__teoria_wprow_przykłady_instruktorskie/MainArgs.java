package Week_03_09_10mar2019.__sobota._T_3_Statyczne_pola_metody_klasy.__teoria_wprow_przykłady_instruktorskie;

public class MainArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There are no arguments!");
            return;
        }

        String name = args[0];
        String number = "?";
        if (args.length > 1) {
            number = args[1];
        }

        System.out.println("Hello " + name + " - your number is: " + number);
    }
}
