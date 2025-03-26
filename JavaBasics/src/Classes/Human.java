package Classes;

public class Human {
    private int Age;
    private String Name;

    public Human(int age, String name) {
        Age = age;
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
