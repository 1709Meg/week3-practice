package aggregation;

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String ln, String fn, String officeNum) {
        this.lastName = ln;
        this.firstName = fn;
        this.officeNumber = officeNum;
    }

    public Instructor(Instructor other) {
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.officeNumber = other.officeNumber;
    }

    public void set(String ln, String fn, String officeNum) {
        this.lastName = ln;
        this.firstName = fn;
        this.officeNumber = officeNum;
    }

    public String toString() {
        return ("Instructor: " + firstName + " " + lastName + " Office number: " + officeNumber);
    }
}
