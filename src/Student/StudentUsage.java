package Student;

public class StudentUsage {
    public static void main(String[] args) {
        Student studentFirst = new Student();
        studentFirst.setFirstName("Adaś");
        studentFirst.setYearOfBirth(2000);
        int[] studentGrades = {5,5,5,3,4};
        studentFirst.addStudentGrades(studentGrades);

        System.out.println(studentFirst.gradesAverage());

    }

}
