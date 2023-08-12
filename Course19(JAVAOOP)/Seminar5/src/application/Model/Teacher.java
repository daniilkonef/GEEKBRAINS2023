public class Teacher extends User{
    // field
    private Integer ID;

    // method



    // constructor
    public Teacher(String lastName, String firstName, String secondName) {
        super(lastName, firstName, secondName);
        ID = User.getID();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ID=" + ID +
                "} " + super.toString();
    }
}
