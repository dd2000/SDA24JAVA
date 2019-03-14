package Week_02_02_03mar2019.___weekend_02_Rozwiazane_zadania__Instruktorskie.encapsulation.family_tree;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s, wiek: %d", name, surname, age);
    }
}
