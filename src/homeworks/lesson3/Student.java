package homeworks.lesson3;

/**
 * Create Console Application project in Java.
 * Add class Student to the project.
 * Class Student should consist of
 * two private fields: name and rating;
 * properties for access to these fields
 * static field avgRating – average rating of all students
 * default constructor and constructor with parameters
 * methods:
 * betterStudent - to definite the better student (between two, return true or false)
 * toString - to output information about student
 * <p>
 * In the method main() create 3 objects of Student type and input information about them.
 * Display the average and total rating of all student.
 */

//Homework to Lesson 3 - 19.07.22
@SuppressWarnings("unused")
public class Student {
    private String name;
    private int rating;
    private static int avgRating;

    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    //definite the better student (between two, return true or false)
    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    //output information about student
    @Override
    public String toString() {
        return "name: " + this.name + ", " + "rating: " + this.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static int getAvgRating() {
        return avgRating;
    }

    public static void setAvgRating(int avgRating) {
        Student.avgRating = avgRating;
    }
}