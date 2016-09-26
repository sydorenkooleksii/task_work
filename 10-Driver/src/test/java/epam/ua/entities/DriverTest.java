package epam.ua.entities;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Oleksii on 26.09.2016.
 */
public class DriverTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();



    @Test
    public void creatCorectRoute() throws Exception {
        Human oleksii = new Human("Oleksii" , new Date() , Human.Gender.MALE , Human.BloodGroup.SECOND);;
        Driver oleksiiD = new Driver(oleksii ,new DriverLicense(new Date() ,
                DriverLicense.Category.A , new Date()));
        GasolineCar car = new GasolineCar("Tesla", "AM5454KB", "10991099" , DriverLicense.Category.A ,
                10 , 20 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , oleksiiD , "Kyiv" , "Rivne");
        System.out.println(route);
    }

    @Test
    public void creatRouteWithNotDiferentCategoriesInDriverPass() throws Exception {

        Human oleksii = new Human("Oleksii" , new Date() , Human.Gender.MALE , Human.BloodGroup.SECOND);;
        Driver oleksiiD = new Driver(oleksii ,new DriverLicense(new Date() ,
                DriverLicense.Category.A.C.D , new Date()));
        GasolineCar car = new GasolineCar("Tesla", "AM5454KB", "10991099" , DriverLicense.Category.C.D ,
                10 , 20 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , oleksiiD , "Kyiv" , "Rivne");
        System.out.println(route);
    }





    @Test
    public void creatRouteWithNotDiferentCategoriesInDriverNotPass() throws Exception {
        Human oleksii = new Human("Oleksii" , new Date() , Human.Gender.MALE , Human.BloodGroup.SECOND);;
        Driver oleksiiD = new Driver(oleksii ,new DriverLicense(new Date() ,
                DriverLicense.Category.A.C.D , new Date()));
        GasolineCar car = new GasolineCar("Tesla", "AM5454KB", "10991099" , DriverLicense.Category.C ,
                10 , 20 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , oleksiiD , "Kyiv" , "Rivne");
        System.out.println(route);
    }

//Дата видачі молодше за дату закінчення
    @Test
    public void creatRouteWithSpoiledDataLicense() {
        expectedException.expect(Exception.class);
        Human oleksii = new Human("Oleksii" , new Date() , Human.Gender.MALE , Human.BloodGroup.SECOND);;
        Driver oleksiiD = new Driver(oleksii ,new DriverLicense(new Date(100,12,12),
                DriverLicense.Category.A , new Date(200,12,13)));
        GasolineCar car = new GasolineCar("Tesla", "AM5454KB", "10991099" , DriverLicense.Category.A ,
                10 , 20 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , oleksiiD , "Kyiv" , "Rivne");
        System.out.println(route);
    }


    @Test
    public void creatRouteWithDiferentCategory() throws Exception {
        Human oleksii = new Human("Oleksii" , new Date() , Human.Gender.MALE , Human.BloodGroup.SECOND);;
        Driver oleksiiD = new Driver(oleksii ,new DriverLicense(new Date() ,
                DriverLicense.Category.C , new Date()));
        GasolineCar car = new GasolineCar("Tesla", "AM5454KB", "10991099" , DriverLicense.Category.A ,
                10 , 20 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , oleksiiD , "Kyiv" , "Rivne");
        System.out.println(route);
    }



    @Test
    public void creatRouteWithNull() {
        expectedException.expect(Exception.class);
        Human oleksii = null;
        Driver oleksiiD = new Driver(oleksii ,new DriverLicense(null ,
                DriverLicense.Category.A , null));
        GasolineCar car = new GasolineCar(null, null, null , DriverLicense.Category.A ,
                0 , 0 , null);
        Route route = new Route(car , oleksiiD , null , null);
        System.out.println(route);
    }
}