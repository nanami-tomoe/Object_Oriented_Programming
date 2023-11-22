public class Instructor extends Person{
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    public String toString() {
        return "Instructor[" + super.toString() + ", salary=" + salary + "]";
    }
}
