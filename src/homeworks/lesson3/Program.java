package homeworks.lesson3;

//Homework to Lesson 3 - 19.07.22
public class Program {
    public static void main(String[] args) {

        //Task1: Student
        //create 3 objects of Student type and input information about them
        Student student1 = new Student("Sam", 89);
        Student student2 = new Student("Adriana", 79);
        Student student3 = new Student("Niki", 98);

        //display the average and total rating of all student
        Student.setAvgRating((student1.getRating() + student2.getRating() + student3.getRating()) / 3);
        System.out.println("average rating: " + Student.getAvgRating());
        System.out.println("total rating: " + Student.getAvgRating() * 3 + "\n");

        // ********************************************************************************************* //

        //Task2: Employee
        //create 3 objects of Employee type. InputData information about them.
        Employee employee1 = new Employee("Sam", 10, 160);
        Employee employee2 = new Employee("Adriana", 15, 180);
        Employee employee3 = new Employee("Niki", 20, 120);

        //display the total salary of all workers to screen
        Employee.setTotalSum(employee1.getSalary() + employee2.getSalary() + employee3.getSalary());
        System.out.println("total salary: " + Employee.getTotalSum());

        // ********************************************************************************************* //

        //Task3: Person
        //create 5 objects of Person type and input information about them
        Person person1 = new Person();
        person1.input("Dmytro", "Ilyin", 1955);
        Person person2 = new Person();
        person2.input("Polina", "Kazumi", 1983);
        Person person3 = new Person();
        person3.input("Viktoria", "Lamina", 1988);
        Person person4 = new Person();
        person4.input("Ekaterina", "Cordova", 1990);
        Person person5 = new Person();
        person5.input("Mihail", "Kotaro", 1994);
    }
}