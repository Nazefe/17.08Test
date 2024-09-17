package Task_One;


public class Main {
    public static void main(String[] args) {
        Student students1 = new Student("Joe", "1");
        Student students2 = new Student("Billy", "2");
        students1.addStudent("1",students1);
        students1.getStudentId("1");
    }

}