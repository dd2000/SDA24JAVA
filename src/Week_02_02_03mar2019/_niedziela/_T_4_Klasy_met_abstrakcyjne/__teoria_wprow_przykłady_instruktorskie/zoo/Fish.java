package Week_02_02_03mar2019._niedziela._T_4_Klasy_met_abstrakcyjne.__teoria_wprow_przykłady_instruktorskie.zoo;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    public AnimalType getType() {
        return AnimalType.FISH;
    }

    @Override
    public String getVoice() {
        return "Bul, bul!";
    }
}