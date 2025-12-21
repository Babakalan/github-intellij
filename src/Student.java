public class Student extends Human {
    private String favoriteSubject;
    private float height;

    public Student(String favoriteSubject, float height, int age, String name, boolean active) {
        super(age, name, active);
        this.favoriteSubject = favoriteSubject;
        this.height = height;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void hello() {
        System.out.println("Student: " + getName() +
                ", subject: " + favoriteSubject +
                ", height: " + height +
                ", active: " + isActive());
    }
}
