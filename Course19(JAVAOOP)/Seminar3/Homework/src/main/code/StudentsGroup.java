import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroup implements Iterable<Student>{
    private List<Student> students;

    public StudentsGroup(){
        this.students = new ArrayList<>();
    }
    public StudentsGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students; 
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + students +
                '}';
    }




    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator((this));
    }
}
