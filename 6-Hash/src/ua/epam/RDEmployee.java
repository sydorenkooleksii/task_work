package ua.epam;

/**
 * Created by Oleksii_Sydorenko on 9/21/2016.
 */
public class RDEmployee extends EpamEmployee {

    public enum Specialization {

        TESTER, AT, DEVOPS, DEVELOPER, BI, MANAGER
    }
private Specialization specialization;
    public RDEmployee(String name, int age, String education, String famelyStatus,Specialization specialization) {
        super(name, age, education, famelyStatus);
        this.specialization=specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RDEmployee that = (RDEmployee) o;

        return specialization == that.specialization;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + specialization.hashCode();
        return result;
    }
}
