package aggregation;

public class Course {

    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String name, Instructor ins, TextBook text) {
        this.courseName = name;
        this.instructor = ins;
        this.textBook = text;
    }

    public String getName() {
        return this.courseName;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public TextBook getTextBook() {
        return this.textBook;
    }

    public String toString() {
        return ("Course name: " + this.courseName + " Course instructor: " + this.instructor + " Course textbook: "
                + this.textBook);
    }

}
