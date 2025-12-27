package model;
public abstract class Human {
    protected int age;
    protected String name;
    protected boolean active;

    public Human(int age, String name, boolean active) {
        this.age = age;
        this.name = name;
        this.active = active;
    }
    public abstract String role();

    public void hello() {
        System.out.println("Hi, I'm " + name + ". Age: " + age + ". Active: " + active);
    }
    public String info() {
        return role() + " -> name=" + name + ", age=" + age + ", active=" + active;
    }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}

