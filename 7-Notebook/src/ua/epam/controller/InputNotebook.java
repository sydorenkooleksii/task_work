package ua.epam.controller;

import ua.epam.model.entity.Adress;
import ua.epam.model.entity.Group;

/**
 * Created by Oleksii_Sydorenko on 9/22/2016.
 */
public class InputNotebook {

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
    private Group group;
    private Adress adress;



    public Group getGroup() {
        return group;
    }

     void setGroup(Group group) {
        this.group = group;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDaddyname() {
        return daddyname;
    }

    public void setDaddyname(String daddyname) {
        this.daddyname = daddyname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCellphone2() {
        return cellphone2;
    }

    public void setCellphone2(String cellphone2) {
        this.cellphone2 = cellphone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataOfChange() {
        return dataOfChange;
    }

    public void setDataOfChange(String dataOfChange) {
        this.dataOfChange = dataOfChange;
    }
}
