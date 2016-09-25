package ua.epam;

/**
 * Created by Oleksii_Sydorenko on 9/23/2016.
 */
public class Pet extends Animal{

private String nameOfPet;

    public Pet() {
    }

    public Pet(String nameOfClass, int limb, int child, String nameOfPet) {
        super(nameOfClass, limb, child);
        this.nameOfPet = nameOfPet;
    }

    public String getNameOfPet() {
        return nameOfPet;
    }

    public void setNameOfPet(String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }

    @Override
    public String toString() {

        return super.toString() + "Pet{" +
                "nameOfPet='" + nameOfPet + '\'' +
                '}';
    }
}
