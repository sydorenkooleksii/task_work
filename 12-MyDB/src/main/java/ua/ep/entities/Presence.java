package ua.ep.entities;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Presence {

    private boolean presence1;
    private int studentIdSt;
    private int idPresence;
    private String dateOfPresence;

    public Presence(boolean presence1, int studentIdSt, int idPresence, String dateOfPresence) {
        this.presence1 = presence1;
        this.studentIdSt = studentIdSt;
        this.idPresence = idPresence;
        this.dateOfPresence = dateOfPresence;
    }

    public boolean isPresence1() {
        return presence1;
    }

    public void setPresence1(boolean presence1) {
        this.presence1 = presence1;
    }

    public int getStudentIdSt() {
        return studentIdSt;
    }

    public void setStudentIdSt(int studentIdSt) {
        this.studentIdSt = studentIdSt;
    }

    public int getIdPresence() {
        return idPresence;
    }

    public void setIdPresence(int idPresence) {
        this.idPresence = idPresence;
    }

    public String getDateOfPresence() {
        return dateOfPresence;
    }

    public void setDateOfPresence(String dateOfPresence) {
        this.dateOfPresence = dateOfPresence;
    }

    @Override
    public String toString() {
        return "Presence{" +
                "presence1=" + presence1 +
                ", studentIdSt=" + studentIdSt +
                ", idPresence=" + idPresence +
                ", dateOfPresence='" + dateOfPresence + '\'' +
                '}';
    }
}
