package Week_01_23_24_lut2019.___weekend_01_Rozwiazane_zadania___Instruktorskie.oop;

// Utwórz klasę Source_Car z polami: brand i color
// {na katalogu}(Alt + Insert → Java Class lub PPM → New →  Java Class)
//
// Dodaj konstruktor i oba pola jako argumenty
// {w klasie}(Alt + Insert → Constructor lub PPM → Generate →  Constructor)
//
// Dodaj metodę toString() i dodaj oba pola
// {w klasie}(Alt + Insert → toString() lub PPM → Generate →  toString())
public class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Source_Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
