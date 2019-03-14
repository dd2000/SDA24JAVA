package Week_01_23_24_lut2019.___weekend_01_Rozwiazane_zadania___Instruktorskie.oop;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(13, "2018-10-01", "10:45");
        temperature.show();
        temperature.showInFahrenheit();
    }
}
