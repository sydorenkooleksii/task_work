package ua.epam;

import ua.epam.Model.Entity.Notebook;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
	// write your code here
        View view = new View();
        Notebook notebook = new Notebook();
        Controller controller = new Controller(notebook,view);


        controller.processUser();


    }
}
