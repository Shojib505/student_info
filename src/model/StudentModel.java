package model;

public class StudentModel {
    private int id;
    private String name;
    private int roll;
    private int age;
    private String address;
    private String email;
    private String className;

    public StudentModel() {
    }

    public StudentModel(String name, int roll, int age,
                        String address, String email, String className) {
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.address = address;
        this.email = email;
        this.className = className;
    }

    public StudentModel(int id, String name, int roll, int age,
                        String address, String email, String className) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.address = address;
        this.email = email;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}