package Week_02_02_03mar2019._niedziela._T_4_Klasy_met_abstrakcyjne.__teoria_wprow_przykłady_instruktorskie.zoo;

public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public AnimalType getType() {
        return AnimalType.MAMMAL;
    }
}