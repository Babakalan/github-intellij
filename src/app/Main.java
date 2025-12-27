package app;
import model.*;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();

                System.out.print("Active (true/false): ");
                boolean active = sc.nextBoolean();
                sc.nextLine();

                System.out.print("Group: ");
                String group = sc.nextLine();

                System.out.print("GPA: ");
                float gpa = sc.nextFloat();
                sc.nextLine();

                System.out.print("Student ID: ");
                String studentId = sc.nextLine();

                Student s1 = new Student(age, name, active, group, gpa, studentId);
                Human h1 = new Student(age, name, active, group, gpa, studentId);
                IStudy i1 = new Student(age, name, active, group, gpa, studentId);

                Employee e1 = new Employee(25, "Bekzat", true, "Manager", 300000f);
                Human h2 = new Employee(30, "Era", false, "Developer", 500000f);
                IWork w1 = new Employee(28, "Zharkyn", true, "QA", 250000f);
                IStudy i2 = new Employee(40, "Dana", true, "Lead", 700000f);

                System.out.println("\n--- Human methods ---");
                h1.hello();
                h1.info();
                h2.hello();
                h2.info();

                System.out.println("\n--- Student ---");
                s1.study();
                System.out.println("GPA: " + s1.getPerformance());
                s1.showStudentCard();

                System.out.println("\n--- Employee ---");
                e1.work();
                System.out.println("Income: " + e1.getIncome());
                e1.study();
                System.out.println("Performance: " + e1.getPerformance());

                System.out.println("\nEmployees created: " + Employee.getEmployeeCount());

                System.out.println("\n--- Interface references ---");
                i1.study();
                System.out.println(i1.getPerformance());

                w1.work();
                System.out.println(w1.getIncome());

                i2.study();
                System.out.println(i2.getPerformance());
        }
}
