package ua.ep.entities;

import java.util.Date;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Practice {
    private int idPractice;
    private int training;
    private int studentIdStudent;
    private int teacherIdTeacher;
    private String dateOfPractice;


    public Practice(int idPractice, int training, int studentIdStudent, int teacherIdTeacher, String dateOfPractice) {
        this.idPractice = idPractice;
        this.training = training;
        this.studentIdStudent = studentIdStudent;
        this.teacherIdTeacher = teacherIdTeacher;
        this.dateOfPractice = dateOfPractice;
    }

    public int getIdPractice() {
        return idPractice;
    }

    public void setIdPractice(int idPractice) {
        this.idPractice = idPractice;
    }

    public int getTraining() {
        return training;
    }

    public void setTraining(int training) {
        this.training = training;
    }

    public int getStudentIdStudent() {
        return studentIdStudent;
    }

    public void setStudentIdStudent(int studentIdStudent) {
        this.studentIdStudent = studentIdStudent;
    }

    public int getTeacherIdTeacher() {
        return teacherIdTeacher;
    }

    public void setTeacherIdTeacher(int teacherIdTeacher) {
        this.teacherIdTeacher = teacherIdTeacher;
    }

    public String getDateOfPractice() {
        return dateOfPractice;
    }

    public void setDateOfPractice(String dateOfPractice) {
        this.dateOfPractice = dateOfPractice;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "idPractice=" + idPractice +
                ", training=" + training +
                ", studentIdStudent=" + studentIdStudent +
                ", teacherIdTeacher=" + teacherIdTeacher +
                ", dateOfPractice='" + dateOfPractice + '\'' +
                '}';
    }
}
