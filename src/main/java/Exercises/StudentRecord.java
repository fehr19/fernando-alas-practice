package Exercises;

public class StudentRecord {

    // Constructors
    public StudentRecord() {
        studentCount++;
    }
    public StudentRecord(String name) {
        studentCount++;
        this.studentName = name;
    }
    public StudentRecord(String name, double mathScore) {
        this(name);
        this.mathScore = mathScore;
        studentCount++;
    }
    public StudentRecord(String name, double mathScore, double scienceScore, double algebraScore) {
        this(name);
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.algebraScore = algebraScore;
        studentCount++;
    }

    // Fields
    static int studentCount;
    String studentName;
    double mathScore;
    double scienceScore;
    double algebraScore;

    // Getters - Setters
    private static int getStudentCount() {

        return studentCount;
    }

    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public double getMathScore() {

        return mathScore;
    }

    public void setMathScore(double mathScore) {

        this.mathScore = mathScore;
    }

    public double getScienceScore() {

        return scienceScore;
    }

    public void setScienceScore(double scienceScore) {

        this.scienceScore = scienceScore;
    }

    public double getAlgebraScore() {

        return algebraScore;
    }

    public void setAlgebraScore(double algebraScore) {

        this.algebraScore = algebraScore;
    }

    // Class Methods
    public double avgScore() {
        return ((mathScore + scienceScore + algebraScore) / 3);
    }

    public void print(String name) {

        System.out.println("Student name: " + name);
    }

    public void print(String name, double avgScore) {
        System.out.printf(name + " has an average of %.2f%%\n", avgScore);
    }
}
