package Student;

public class Student {
    private String name;
    private int yearOfBirth ;
    private int[] grades;

    public double gradesAverage() {
        int sumOfGrades = 0;
        for (int i = 0; i <= grades.length -1; i++) {
            sumOfGrades +=  grades[i];
        }
        return (double) sumOfGrades / grades.length;
    }

    public void setFirstName(String studentName) {
        name = studentName;
    }

    public void setYearOfBirth(int birthOfStudent) {
        yearOfBirth = birthOfStudent;
    }

    public void addStudentGrades(int[] studentGrades) {
        grades = studentGrades;
    }
}
