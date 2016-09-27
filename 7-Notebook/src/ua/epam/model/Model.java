package ua.epam.model;

import ua.epam.model.entity.Adress;
import ua.epam.model.entity.Notebook;
import ua.epam.model.entity.Group;

/**
 * Created by Oleksii_Sydorenko on 9/22/2016.
 */
public class Model {


    public Notebook createConstructorNotebook(String name, String surname, String daddyname, String nickname,
                                              String comment, String homephone, String cellphone, String cellphone2,
                                              String email, String skype, String data, String dataOfChange, Group group, Adress adress) {

        Notebook notebook = new Notebook(name, surname, daddyname, nickname,
                comment, homephone, cellphone, cellphone2, email, skype, data, dataOfChange, group, adress);


        return notebook;

    }

}
