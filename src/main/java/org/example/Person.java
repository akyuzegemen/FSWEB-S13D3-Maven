package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    double height;
    double weight;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double weight, double height, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public Person()
    {}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen()
    {
        return (this.age >= 13 && this.age <= 19);
    }


}
