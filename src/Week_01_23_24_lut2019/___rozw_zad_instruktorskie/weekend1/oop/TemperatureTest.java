package Week_01_23_24_lut2019.___rozw_zad_instruktorskie.weekend1.oop;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(13, "2018-10-01", "10:45");
        temperature.show();
        temperature.showInFahrenheit();
    }
}
