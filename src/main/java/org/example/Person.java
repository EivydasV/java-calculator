package org.example;

import java.util.Optional;

public class Person {
    private String name;
    private int age;
    private float averageGrades;
    private char firstLetterOfSurname;
    private String surname;

    public Person(String name, int age, float averageGrades, char firstLetterOfSurname, String surname) {
        this.name = name;
        this.age = age;
        this.averageGrades = averageGrades;
        this.firstLetterOfSurname = firstLetterOfSurname;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageGrades=" + averageGrades +
                ", firstLetterOfSurname=" + firstLetterOfSurname +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(float averageGrades) {
        this.averageGrades = averageGrades;
    }

    public char getFirstLetterOfSurname() {
        return firstLetterOfSurname;
    }

    public void setFirstLetterOfSurname(char firstLetterOfSurname) {
        this.firstLetterOfSurname = firstLetterOfSurname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
