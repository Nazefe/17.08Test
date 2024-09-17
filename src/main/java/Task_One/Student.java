package Task_One;

import java.util.HashMap;
import java.util.Map;

public class Student {
private String name;
private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    Map<String, Student> studentsId = new HashMap<String, Student>();

        void addStudent(String id, Student student){
            studentsId.put(id, student);
    }

    public void getStudentId(String id) {
        System.out.println(studentsId.get(id).getName());
    }

}
