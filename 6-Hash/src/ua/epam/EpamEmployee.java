package ua.epam;

/**
 * Created by Oleksii_Sydorenko on 9/21/2016.
 */
public class EpamEmployee {

    private String name;
    private int age;
    private String education;
    private String famelyStatus;

    public EpamEmployee(String name, int age, String education, String famelyStatus) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.famelyStatus = famelyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EpamEmployee that = (EpamEmployee) o;

        if (age != that.age) return false;
        if (!name.equals(that.name)) return false;
        if (!education.equals(that.education)) return false;
        return famelyStatus.equals(that.famelyStatus);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + education.hashCode();
        result = 31 * result + famelyStatus.hashCode();
        return result;
    }
}
