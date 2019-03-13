package Week_01_23_24_lut2019.___rozw_zad_instruktorskie.weekend1.oop;

// W klasie Source_HelloWorldApp utwórz nowy obiekt na podstawie klasy Source_Car, np.
// Source_Car toyota = new Source_Car("Toyota", "black");
//
// Wypisz na konsoli informację o samochodzie
//  System.out.println("My car is: " + toyota);
// Uruchom program
// {w klasie}(Alt + Shift + F10 lub PPM → Run Source_Car.main())
public class HelloWorldApp {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "black");
        System.out.println("My car is: " + toyota);
    }
}
