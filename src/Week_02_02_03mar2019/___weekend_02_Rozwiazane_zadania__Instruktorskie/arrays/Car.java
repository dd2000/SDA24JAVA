package Week_02_02_03mar2019.___weekend_02_Rozwiazane_zadania__Instruktorskie.arrays;

public class Car {
    private String brand;
    private String name;

    public Car(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Source_Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
