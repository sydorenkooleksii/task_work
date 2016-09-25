package ua.epam;

/**
 * Created by Oleksii_Sydorenko on 9/23/2016.
 */
public class Animal {

    private String nameOfClass;
    private int limb;
    private int child;


    public Animal(String nameOfClass, int limb, int child) {
        this.nameOfClass = nameOfClass;
        this.limb = limb;
        this.child = child;
    }
    public Animal() {
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public int getLimb() {
        return limb;
    }

    public void setLimb(int limb) {
        this.limb = limb;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    @MyAnn
    public String returnNameOfClassWithLimb() {
        String result = "nameOfClass = " + nameOfClass + " have " + limb + " limb";
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameOfClass='" + nameOfClass + '\'' +
                ", limb=" + limb +
                ", child=" + child +
                '}';
    }
}
