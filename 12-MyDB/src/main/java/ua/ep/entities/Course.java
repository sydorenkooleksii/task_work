package ua.ep.entities;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Course {

    private int idCourse;
    private String category;
    private int price;
    private int duration;

    public Course(int idCourse, String category, int price, int duration) {
        this.idCourse = idCourse;
        this.category = category;
        this.price = price;
        this.duration = duration;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return '\n'+"Course{" +'\n'+
                "idCourse=" + idCourse +'\n'+
                "category='" + category + '\'' +'\n'+
                "price=" + price +'\n'+
                "duration=" + duration +
                '}'+'\n';
    }
}
