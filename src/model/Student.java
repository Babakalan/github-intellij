package model;

public final class Student extends Human implements IStudy {
    private String group;
    private float gpa;
    private final String studentId;
    public Student(int age, String name, boolean active,
                   String group, float gpa, String studentId) {
        super(age, name, active);
        this.group = group;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    @Override
    public String role() {
        return "Student";
    }

    @Override
    public void study() {
        System.out.println(name + " is studying in group " + group);
    }

    @Override
    public float getPerformance() {
        return gpa;
    }

    public final void showStudentCard() {
        System.out.println("StudentCard: id=" + studentId + ", name=" + name + ", group=" + group);
    }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }
    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }
    public String getStudentId() { return studentId; }
}
