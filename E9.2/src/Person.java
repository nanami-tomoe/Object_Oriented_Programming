public class Person {
    private String name;
    private int birthYear;

    public Person() {
        name = "";
        birthYear = 0;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return birthYear;
    }

    public String toString() {
        return "Person[name=" + name + ", birthYear=" + birthYear + "]";
    }
}
