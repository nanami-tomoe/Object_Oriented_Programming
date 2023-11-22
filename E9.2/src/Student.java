public class Student extends Person{
    private String major;
    public Student(String name, int birthYear, String major) {
        super(name, birthYear);
        this.major = major;
    }

    public String toString() {
        return "Student[" + super.toString() + ", major=" + major + "]";
    }
}
