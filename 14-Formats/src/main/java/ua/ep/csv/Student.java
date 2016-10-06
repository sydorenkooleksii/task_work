package ua.ep.csv;

/**
 * Created by Oleksii_Sydorenko on 10/5/2016.
 */
public class Student {

    private int idStudent;
    private String firstName;
    private String lastName;
    private String dateOfStart;

    public Student() {
    }

    public Student(int idStudent, String firstName, String lastName, String dateOfStart) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfStart = dateOfStart;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }


    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfStart='" + dateOfStart + '\'' +
                '}';
    }
}
