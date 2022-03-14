public class Student extends User{
    String firstName;
    String LastName;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public Student(int id, String email, String firstName, String lastName) {
        super(id, email);
        this.firstName = firstName;
        LastName = lastName;
    }
}
