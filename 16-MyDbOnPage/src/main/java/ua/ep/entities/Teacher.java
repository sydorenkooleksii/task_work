package ua.ep.entities;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Teacher {

    private int idTeacher;
    private String firstName;
    private String lastName;

    public Teacher(int idTeacher, String firstName, String lastName) {
        this.idTeacher = idTeacher;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdTeacher() {
        return idTeacher;
    }
    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
