package Student;

import java.util.Arrays;

public class Student {
    public String name;
    public int yearOfBirth ;
    private int[] grades;

    public double gradesAverage() {
        if (grades == null) {
            return 0;
        }
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
