package Task_Second;

public class Main {
    public static void main(String[] args) {
        SubjectGrades mathGrades = new SubjectGrades("Mathematics");

        mathGrades.HashMap("DiaTea", 5);
        mathGrades.HashMap("Boba", 5);
        mathGrades.HashMap("Biba", 5);

        System.out.println(mathGrades);

        double average = mathGrades.calculateAverage();
        System.out.println("Average Grade: " + average);
    }
}
