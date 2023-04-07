package exercises.student_Record;

public class MainStudentRecord {
    public static void main(String[] args) {
        /*StudentRecord student1 = new StudentRecord();
        student1.setStudentName("Fernando Alas");
        student1.setAlgebraScore(99.6);
        student1.setMathScore(95.1);
        student1.setScienceScore(92.3);

        StudentRecord student2 = new StudentRecord();
        student2.setStudentName("Other Student");
        student2.setAlgebraScore(89.7);
        student2.setMathScore(94.2);
        student2.setScienceScore(98.9);*/


        /*
        System.out.println("Name: " + student1.getStudentName());
        System.out.printf("Average Score: %.1f%%\n", student1.avgScore());

        System.out.println("Name: " + student2.getStudentName());
        System.out.printf("Average Score: %.1f%%\n", student2.avgScore());*/

        StudentRecord student1 = new StudentRecord("Fernando Alas", 99.6, 95.1, 92.3);

        StudentRecord student2 = new StudentRecord("Other Student");
        student2.setAlgebraScore(89.7);
        student2.setMathScore(94.2);
        student2.setScienceScore(98.9);

        StudentRecord student3 = new StudentRecord("Another Person", 84.2);
        student3.setAlgebraScore(82.7);
        student3.setScienceScore(78.9);

       /* student1.print(student1.studentName);
        student2.print(student2.studentName);
        student3.print(student3.studentName);*/

        student1.print(student1.studentName, student1.avgScore());
        student2.print(student2.studentName, student2.avgScore());
        student3.print(student3.studentName, student3.avgScore());

        //Print number of students
        System.out.println(StudentRecord.studentCount);


    }
}
