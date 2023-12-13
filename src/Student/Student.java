package Student;

import java.util.Arrays;

public class Student {
    public String name;
    public int yearOfBirth ;
    private int[] grades;

    public Student () {
        this("Uczeń testowy");
    }
    public Student (String name) {
        this(name, 0, null);
    }
    public Student(String name, int yearOfBirth) {
        this(name, yearOfBirth, null);
    }

    public Student (String name, int yearOfBirth, int[] grades) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.grades = grades;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setStudentGrades(int[] grades) {
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
