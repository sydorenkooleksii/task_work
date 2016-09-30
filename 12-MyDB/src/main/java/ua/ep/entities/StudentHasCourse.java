package ua.ep.entities;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class StudentHasCourse {

    private int studentIdStudent;
    private int courseIdCourse;

    public StudentHasCourse(int studentIdStudent, int courseIdCourse) {
        this.studentIdStudent = studentIdStudent;
        this.courseIdCourse = courseIdCourse;
    }

    public int getStudentIdStudent() {
        return studentIdStudent;
    }

    public void setStudentIdStudent(int studentIdStudent) {
        this.studentIdStudent = studentIdStudent;
    }

    public int getCourseIdCourse() {
        return courseIdCourse;
    }

    public void setCourseIdCourse(int courseIdCourse) {
        this.courseIdCourse = courseIdCourse;
    }

    @Override
    public String toString() {
        return "StudentHasCourse{" +
                "studentIdStudent=" + studentIdStudent +
                ", courseIdCourse=" + courseIdCourse +
                '}';
    }
}
