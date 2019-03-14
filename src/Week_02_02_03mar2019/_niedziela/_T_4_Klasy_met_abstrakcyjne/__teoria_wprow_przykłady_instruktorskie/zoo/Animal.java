package Week_02_02_03mar2019._niedziela._T_4_Klasy_met_abstrakcyjne.__teoria_wprow_przykłady_instruktorskie.zoo;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract AnimalType getType();

    public abstract String getVoice();

    public String speak() {
        return getType() + " of name: " + getName() + " says: " + getVoice();
    }
}