package Week_02_02_03mar2019.__sobota._T_1_encapsulation_hermetyzacja._Zadania_encapsulation_hermetyzacja_Slajd_086.Zad_3_slajd_086_encapsulation.task_zadanie_3.task.user;

public class UserManager {
    public UserModel user;

    private void createUser(String firstName, String lastName, int age) {

        user = new UserModel(firstName,lastName,age);
    } // konstruktor

    protected UserModel getUser() {
        return user;
    }
}
