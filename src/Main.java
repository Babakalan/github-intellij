import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Human h1 = new Human(20, "Dana", true);
                Student s1 = new Student("Discrete Math", 1.72f, 18, "Serzhan", true);
                Employee e1 = new Employee("Lab assistant", 45000f, 22, "Arman", true);
                Scanner sc = new Scanner(System.in);

                System.out.println("=== Enter student data ===");
                System.out.print("Name: ");
                s1.setName(sc.nextLine());

                System.out.print("Age: ");
                s1.setAge(sc.nextInt());

                System.out.print("Active? (true/false): ");
                s1.setActive(sc.nextBoolean());

                System.out.print("Height (float, например 1.75): ");
                s1.setHeight(sc.nextFloat());

                sc.nextLine();

                System.out.print("Favorite subject: ");
                s1.setFavoriteSubject(sc.nextLine());

                System.out.println("\nStudent name (getter): " + s1.getName());
                System.out.println("Student age (getter): " + s1.getAge());

                s1.setAge(s1.getAge() + 1);
                System.out.println("Age after +1 (setter+getter): " + s1.getAge());


                System.out.println("\n=== Methods ===");
                h1.hello();
                s1.hello();
                e1.hello();

                System.out.println("\nInfo from Human (not overridden):");
                System.out.println(s1.info());

                System.out.println("\nEmployees created (static): " + Employee.employeeCount);

                sc.close();
        }
}