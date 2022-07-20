package lessons.lesson3;

public class Program {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Ivan";
        student1.lastName = "Ivanov";
        student1.setAge(50);
        int age = student1.getAge();
        student1.printInfo();

        Student student2 = new Student(
                "Sergiy", "Sergiev", 20);
        student2.printInfo();

        Student student3 = new Student("Oleg", "Olegiv");
        student3.printInfo();

        System.out.println(Student.socialPayment);
    }
}