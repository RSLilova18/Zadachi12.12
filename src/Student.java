import java.lang.reflect.Array;

public class Student {

    String name;
    String Egn;
    int[] grades;
    int course;

    public Student(String name, String egn, int[] grades, int course) {
        this.name = name;
        Egn = egn;
        this.grades = grades;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getEgn() {
        return Egn;
    }

    public int[] getGrades() {
        return grades;
    }

    public int getCourse() {
        return course;
    }
}
