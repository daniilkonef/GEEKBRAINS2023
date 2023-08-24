public class Student extends User {
    // field

    private Integer ID;
    // method


    public Student(String lastName, String firstName, String secondName) {
        super(lastName, firstName, secondName);
        ID = User.getID();
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                "} " + super.toString();
    }
}
