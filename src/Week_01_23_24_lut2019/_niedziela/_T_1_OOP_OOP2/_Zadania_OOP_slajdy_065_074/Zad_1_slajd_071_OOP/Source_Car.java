package Week_01_23_24_lut2019._niedziela._T_1_OOP_OOP2._Zadania_OOP_slajdy_065_074.Zad_1_slajd_071_OOP;

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
