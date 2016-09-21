package ua.epam.Model.Entity;

/**
 * Created by Oleksii on 21.09.2016.
 */
public class Adress {

    private String index;
    private String city;
    private String street;
    private String numberOfHouse;
    private String apartment;


    public Adress (String adress){
        String [] adressArray = adress.split("/");
        this.index = adressArray[0];
        this.city = adressArray[1];
        this.street = adressArray[2];
        this.numberOfHouse = adressArray[3];
        this.apartment = adressArray[4];
    }

    @Override
    public String toString() {
        return "Adress{" +
                "index='" + index + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse='" + numberOfHouse + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
