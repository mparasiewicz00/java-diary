package Student;

import java.util.Arrays;

public class StudentUsage {
    public static void main(String[] args) {
        Student studentFirst = new Student();
        studentFirst.setFirstName("Adaś Kowalski");
        studentFirst.setYearOfBirth(2000);
        int[] studentGrades = {5,5,5,3,4};
        studentFirst.setStudentGrades(studentGrades);

        System.out.println("Imię i nazwisko: " + studentFirst.getName().toUpperCase());
        System.out.println("Rok urodzenia: " + studentFirst.getYearOfBirth());
        System.out.println("Oceny wyglądają następująco: " + Arrays.toString(studentFirst.getGrades()));
        System.out.println("Średnia ocen: " + studentFirst.gradesAverage());



        System.out.println(studentFirst);
    }
}
