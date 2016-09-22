package ua.epam.model.entity;

/**
 * Created by Oleksii_Sydorenko on 9/22/2016.
 */
public class CreateNotebook {


    private String name;
    private String surname;
    private String daddyname;
    private String nickname;
    private String comment;
    private String homephone;
    private String cellphone;
    private String cellphone2;
    private String email;
    private String skype;
    private String data;
    private String dataOfChange;
    private  Group group;
    private Adress adress;

    public CreateNotebook(String name, String surname, String daddyname, String nickname,
                          String comment, String homephone, String cellphone, String cellphone2,
                          String email, String skype, String data, String dataOfChange, Group group,Adress adress) {


        this.name = name;
        this.surname = surname;
        this.daddyname = daddyname;
        this.nickname = nickname;
        this.comment = comment;
        this.homephone = homephone;
        this.cellphone = cellphone;
        this.cellphone2 = cellphone2;
        this.email = email;
        this.skype = skype;
        this.data = data;
        this.dataOfChange = dataOfChange;
        this.group = group;
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "Notebook:"+ '\n' +
                "{name=" + name + '\n' +
                "surname=" + surname + '\n' +
                "daddyname=" + daddyname  + '\n' +
                "nickname=" + nickname + '\n' +
                "comment=" + comment + '\n' +
                "homephone=" + homephone  + '\n' +
                "cellphone=" + cellphone  + '\n' +
                "cellphone2=" + cellphone2  + '\n' +
                "email=" + email  + '\n' +
                "skype=" + skype  + '\n' +
                "data=" + data  + '\n' +
                "dataOfChange=" + dataOfChange  + '\n' +
                "group=" + group + '\n' +
                 adress.toString() +
                '}';
    }


}
