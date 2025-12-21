public class Human {
    private int age;
    private String name;
    private boolean active;

    public Human(int age, String name, boolean active) {
        this.age = age;
        this.name = name;
        this.active = active;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public void hello() {
        System.out.println("Hi, I'm " + name + ". Age: " + age + ". Active: " + active);
    }

    public String info() {
        return "Human -> name=" + name + ", age=" + age + ", active=" + active;
    }
}
