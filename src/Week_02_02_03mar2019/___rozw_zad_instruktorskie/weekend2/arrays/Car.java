package Week_02_02_03mar2019.___rozw_zad_instruktorskie.weekend2.arrays;

public class Car {
    private String brand;
    private String name;

    public Car(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
