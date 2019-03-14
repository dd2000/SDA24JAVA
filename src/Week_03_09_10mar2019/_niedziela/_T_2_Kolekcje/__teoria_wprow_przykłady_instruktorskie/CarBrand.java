package Week_03_09_10mar2019._niedziela._T_2_Kolekcje.__teoria_wprow_przykłady_instruktorskie;

import java.util.Objects;

public class CarBrand implements Comparable<CarBrand> {
    private final String name;

    public CarBrand(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBrand carBrand = (CarBrand) o;
        return Objects.equals(name, carBrand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "CarBrand{" +
            "name='" + name + '\'' +
            '}';
    }

    @Override
    public int compareTo(CarBrand o) {
        return this.name.compareTo(o.name);
    }
}
