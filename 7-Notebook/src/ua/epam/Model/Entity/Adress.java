package ua.epam.model.entity;

/**
 * Created by Oleksii_Sydorenko on 9/22/2016.
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

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumberOfHouse() {
        return numberOfHouse;
    }

    public String getApartment() {
        return apartment;
    }


    @Override
    public String toString() {
        return "Adress:"+ '\n' +
                "{index=" + index  +
                ", city=" + city  +
                ", street=" + street  +
                ", numberOfHouse=" + numberOfHouse  +
                ", apartment=" + apartment  +
                '}';
    }





}
