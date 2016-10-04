package ua.ep.entities;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Result {

    private int idResult;
    private int previous;
    private int finalResult;
    private int studentIdStudent;
    private String dateOfPrevious;
    private String dateOfFinal;


    public Result(int idResult, int previous, int finalResult, int studentIdStudent, String dateOfPrevious, String dateOfFinal) {
        this.idResult = idResult;
        this.previous = previous;
        this.finalResult = finalResult;
        this.studentIdStudent = studentIdStudent;
        this.dateOfPrevious = dateOfPrevious;
        this.dateOfFinal = dateOfFinal;
    }

    public int getIdResult() {
        return idResult;
    }

    public void setIdResult(int idResult) {
        this.idResult = idResult;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public int getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(int finalResult) {
        this.finalResult = finalResult;
    }

    public int getStudentIdStudent() {
        return studentIdStudent;
    }

    public void setStudentIdStudent(int studentIdStudent) {
        this.studentIdStudent = studentIdStudent;
    }

    public String getDateOfPrevious() {
        return dateOfPrevious;
    }

    public void setDateOfPrevious(String dateOfPrevious) {
        this.dateOfPrevious = dateOfPrevious;
    }

    public String getDateOfFinal() {
        return dateOfFinal;
    }

    public void setDateOfFinal(String dateOfFinal) {
        this.dateOfFinal = dateOfFinal;
    }

    @Override
    public String toString() {
        return "Result{" +
                "idResult=" + idResult +
                ", previous=" + previous +
                ", finalResult=" + finalResult +
                ", studentIdStudent=" + studentIdStudent +
                ", dateOfPrevious='" + dateOfPrevious + '\'' +
                ", dateOfFinal='" + dateOfFinal + '\'' +
                '}';
    }
}
