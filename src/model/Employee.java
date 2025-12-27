package model;

public class Employee extends Human implements IStudy, IWork {

    private String position;
    private float salary;
    private static int employeeCount = 0;
    public Employee(int age, String name, boolean active,
                    String position, float salary) {
        super(age, name, active);
        this.position = position;
        this.salary = salary;
        employeeCount++;
    }
    @Override
    public String role() {
        return "Employee";
    }
    @Override
    public void work() {
        System.out.println(name + " works as " + position);
    }
    @Override
    public float getIncome() {
        return salary;
    }
    @Override
    public void study() {
        System.out.println(name + " is attending professional training");
    }
    @Override
    public float getPerformance() {
        return salary / 100000f;
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }
}
