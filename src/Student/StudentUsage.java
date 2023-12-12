package Student;

public class StudentUsage {
    public static void main(String[] args) {
        Student studentFirst = new Student();
        studentFirst.setFirstName("Adaś Kowalski");
        studentFirst.setYearOfBirth(2000);
        int[] studentGrades = {5,5,5,3,4};
        studentFirst.addStudentGrades(studentGrades);

        System.out.println("Imię i nazwisko: " + studentFirst.name.toUpperCase());
        System.out.println("Rok urodzenia: " + studentFirst.yearOfBirth);
        System.out.println("Średnia ocen: " + studentFirst.gradesAverage());

        System.out.println(studentFirst);
    }
}
