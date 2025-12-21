public class Employee extends Human {
    private String position;
    private float salary;

    public static int employeeCount = 0;

    public Employee(String position, float salary, int age, String name, boolean active) {
        super(age, name, active);
        this.position = position;
        this.salary = salary;
        employeeCount++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void hello() {
        System.out.println("Employee: " + getName() +
                ", position: " + position +
                ", salary: " + salary);
    }
}
