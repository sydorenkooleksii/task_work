package ua.ep.entities;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Fault {
    private int idFault;
    private String fault;
    private int practiceIdPr;


    public Fault(int idFault, String fault, int practiceIdPr) {
        this.idFault = idFault;
        this.fault = fault;
        this.practiceIdPr = practiceIdPr;
    }

    public int getIdFault() {
        return idFault;
    }

    public void setIdFault(int idFault) {
        this.idFault = idFault;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public int getPracticeIdPr() {
        return practiceIdPr;
    }

    public void setPracticeIdPr(int practiceIdPr) {
        this.practiceIdPr = practiceIdPr;
    }

    @Override
    public String toString() {
        return "Fault{" +
                "idFault=" + idFault +
                ", fault='" + fault + '\'' +
                ", practiceIdPr=" + practiceIdPr +
                '}';
    }
}
