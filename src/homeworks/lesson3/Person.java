package homeworks.lesson3;

import java.time.LocalDate;

/**
 * Create Console Application project in Java.
 * Add class Person to the project.
 * Class Person should consist of
 * three private fields: firstName, lastName and birthYear (the birthday year)
 * properties for access to these fields
 * default constructor and constructor with 2 parameters (first and last names)
 * methods:
 * getAge() - to calculate the age of person
 * input() - to input information about person
 * output() - to output information about person
 * changeName(String fn, String ln) - to change the first name or/and last name of person
 * <p>
 * In the method main() create 5 objects of Person type and input information about them.
 */

//Homework to Lesson 3 - 19.07.22
@SuppressWarnings("unused")
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //calculate the age of person
    public int getAge() {
        LocalDate date = LocalDate.now();
        return date.getYear() - birthYear;
    }

    //input information about person
    public void input(String fn, String ln, int by) {
        this.firstName = fn;
        this.lastName = ln;
        this.birthYear = by;
    }

    //output information about person
    public void output() {
        String personInfo = "firstName: " + this.firstName + ", " +
                "lastName: " + this.lastName + ", " + "birthYear: " + this.birthYear;
        System.out.println(personInfo);
    }

    //change the first name or/and last name of person
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}