public class Instructor extends User {
    private String firstName;
    private String lastName;

    public Instructor() {
        super();
    }

    public Instructor(int id, String email, String firstName, String lastName) {
        super(id, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
