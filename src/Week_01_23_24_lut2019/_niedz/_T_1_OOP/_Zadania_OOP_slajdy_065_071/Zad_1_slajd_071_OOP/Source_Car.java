package Week_01_23_24_lut2019._niedz._T_1_OOP._Zadania_OOP_slajdy_065_071.Zad_1_slajd_071_OOP;

public class Source_Car {
    private String brandt;
    private String color;

    public Source_Car(String brandt, String color) {
        this.brandt = brandt;
        this.color = color;
    }

    @Override
    public String toString() {
        return "pl.sda.t01_d2niedz1_oop.Source_Car{" +
                "brandt='" + brandt + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
} // pl.sda.t01_d2niedz1_oop.Source_Car class
