import java.util.ArrayList;

public class Main {

    public static void Main (String[]args) {


        Student student1 = new Student("Raya", "0445046570", new int[]{2, 3, 4, 5, 6, 4, 3, 2, 4, 6}, 2);
        Student student2 = new Student("Krasa", "0445046570", new int[]{2, 3, 4, 3, 6, 4, 3, 2, 4, 6}, 3);
        Student student3 = new Student("Stanka", "0445046570", new int[]{5, 3, 4, 3, 6, 4, 3, 5, 4, 6}, 3);


        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(printsStudentSecondCourse(students));

    }
        public static ArrayList printsStudentSecondCourse(ArrayList<Student> student) {

            ArrayList<Student> newStudent = new ArrayList<>();

            for(Student s: student) {
                if(s.getCourse()> 2) {
                    newStudent.add(s);
                }
        }
            return newStudent;
    }
        public static ArrayList<Student> printPassingStudent(ArrayList<Student> student) {
            ArrayList<Student> passingStudent = new ArrayList<>();
            boolean isTrue;

            for (Student s: student) {
                isTrue = false;
                for(int i=0; i< s.getGrades().length; i++){
                    if(s.getGrades()[i] < 3) {
                        isTrue = true;
                        break;
                    }
                }
                if(!isTrue){
                    passingStudent.add(s);
                }
            }
            return passingStudent;
        }
}
