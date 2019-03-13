package Week_02_02_03mar2019.__sobota._T_1_encapsulation_hermetyzacja._Zadania_encapsulation_hermetyzacja_Slajd_086.Zad_3_slajd_086_encapsulation.task_zadanie_3.task.user;

public class UserModel {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }


    public UserModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    } // konstruktor


}

