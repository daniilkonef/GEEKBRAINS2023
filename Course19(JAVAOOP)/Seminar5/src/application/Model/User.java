public abstract class User {
    // fields
    private String lastName = null;
    private String firstName = null;
    private String secondName = null;
    private static Integer ID = 0;


    // constructor
    public User(String lastName, String firstName, String secondName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.ID++;
    }

    // method
    public String getLastName() {
        return lastName;
    }

    // method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // method
    public String getFirstName() {
        return firstName;
    }

    // method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // method
    public String getSecondName() {
        return secondName;
    }

    // method
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public static Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
