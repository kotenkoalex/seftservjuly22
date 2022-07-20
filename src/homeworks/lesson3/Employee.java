package homeworks.lesson3;

/**
 * Create Console Application project in Java.
 * Add class Employee to the project.
 * Class Employee should consist of
 * three private fields: name, rate and hours;
 * static field totalSum
 * properties for access to these fields;
 * default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
 * methods:
 * getSalary() - to calculate the salary of person (rate * hours)
 * toString() - to output information about employee
 * changeRate(int rate) - to change the rate of some employee and recalculate his salary
 * getBonuses() – to calculate 10% from salary
 * In the method main() create 3 objects of Employee type. Input information about them.
 * Display the total salary of all workers to screen
 */

//Homework to Lesson 3 - 19.07.22
@SuppressWarnings("unused")
public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    //calculate the salary of person (rate * hours)
    public int getSalary() {
        return rate * hours;
    }

    //output information about employee
    @Override
    public String toString() {
        return "name: " + this.name + ", " + "rate: " + this.rate + ", " + "hours: " + hours;
    }

    //change the rate of some employee and recalculate his salary
    public int changeRate(int rate) {
        this.rate = rate;
        return this.getSalary();
    }

    //calculate 10% from salary
    public int getBonuses() {
        return (int) (getSalary() * 0.1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }
}