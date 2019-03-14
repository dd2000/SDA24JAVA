package Week_02_02_03mar2019.___weekend_02_Rozwiazane_zadania__Instruktorskie.encapsulation.task.users;

public class UserModel {
    private String firstName;
    private String lastName;
    private int age;

    public UserModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
