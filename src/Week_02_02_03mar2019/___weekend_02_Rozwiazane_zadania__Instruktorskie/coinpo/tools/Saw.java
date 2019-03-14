package Week_02_02_03mar2019.___weekend_02_Rozwiazane_zadania__Instruktorskie.coinpo.tools;

public class Saw extends Tool {
    private double length;

    public Saw(String model, double price, double length) {
        super(model, price);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public String info() {
        return "Saw " + super.info() + " and length = " + length;
    }
}
