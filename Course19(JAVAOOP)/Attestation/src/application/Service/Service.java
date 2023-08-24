import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public void createStudent(String firstName, String secondName, String lastName) {
        students.add(new Student(lastName, firstName, secondName));
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        teachers.add(new Teacher(firstName, secondName, lastName) );
    }

    public List<Student> getALlStudents(){
        return students;
    }

    public List<Teacher> getALlTeachers(){
        return teachers;
    }

}
