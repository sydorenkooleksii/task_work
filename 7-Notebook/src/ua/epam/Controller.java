package ua.epam;

import ua.epam.Model.Entity.Adress;
import ua.epam.Model.Entity.Notebook;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oleksii_Sydorenko on 9/20/2016.
 */
public class Controller {

    View view = new View();
    Notebook notebook = new Notebook();
    boolean inp = true;

    public static final String REG_TEXT = "^[A-Z][a-z]+";
    public static final String REG_TEXT_AND_NUMBER_SHORT = "^[A-Za-z][A-Za-z0-9_]{1,20}$";
    public static final String REG_TEXT_AND_NUMBER_AND_SYMBOL = "[\\S\\s]{1,150}$";
    public static final String REG_HOMEPHONE = "(\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2})?(\\d{10,12})?(^[+]\\d{3,12})?";
    public static final String REG_CELLPHONE = "(\\(\\d{3}\\)-\\d{2}-\\d{2}-\\d{3})?(\\d{10,12})?(^[+]\\d{3,12})?";
    public static final String REG_EMAIL = "[\\w.%-_]+@[\\w]+\\.[A-Za-z]{2,4}";
    public static  String REG_GROUP = "(HOME)|(WORK)|(SHOP)|(SERVICE)";
    public static final String REG_DATA = "((\\d{2})/(\\d{2})/(\\d{4}))?(\\d{2}):(\\d{2}):(\\d{4})";
    public static final String REG_ADRESS = "\\d{1,5}/([A-Z][a-z]+)/([A-Z][a-z]+)/\\d{1,5}/\\d{1,5}";





    public Controller(Notebook notebook, View view) {
        this.view = view;
        this.notebook = notebook;
    }


    public void processUser() {
       chekSetInputName();
        chekSetInputSurname();
        chekSetInputDaddyname();
        chekSetInputNickname();
       chekSetInputComment();
        chekSetInputHomephone();
        chekSetInputCellphone();
        chekSetInputCellphone2();
        chekSetInputEmail();
        chekSetInputSkype();
        chekSetInputGroup();
        chekSetInputData();
        chekSetChangeData();
        chekSetAdress();

    }


    public void chekSetInputName() {
        while (inp) {
            view.printMessage(View.INPUT_NAME);
            if (inputRegText(scanner())) {
                notebook.setName(notebook.getTemp());
                inp = false;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputSurname() {

        while (!inp) {
            view.printMessage(View.INPUT_SURNAME);
            if (inputRegText(scanner())) {
                notebook.setSurname(notebook.getTemp());
                inp = true;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputDaddyname() {

        while (inp) {
            view.printMessage(View.INPUT_DADDYNAME);
            if (inputRegText(scanner())) {
                notebook.setDaddyname(notebook.getTemp());
                inp = false;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputNickname() {

        while (!inp) {
            view.printMessage(View.INPUT_NICKNAME);
            if (inputRegTextAndNumberShort(scanner())) {
                notebook.setNickname(notebook.getTemp());
                inp = true;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputComment() {

        while (inp) {
            view.printMessage(View.INPUT_COMMENT);
            if (inputRegTextAndNumberAndSymbol(scanner())) {
                notebook.setComment(notebook.getTemp());
                inp = false;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputHomephone() {

        while (!inp) {
            view.printMessage(View.INPUT_HOMEPHONE);
            if (inputRegHomephone(scanner())) {
                notebook.setHomephone(notebook.getTemp());
                inp = true;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputCellphone() {

        while (inp) {
            view.printMessage(View.INPUT_CELLPHONE);
            if (inputRegCellphone(scanner())) {
                notebook.setCellphone(notebook.getTemp());
                inp = false;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputCellphone2() {

        while (!inp) {
            view.printMessage(View.INPUT_CELLPHONE2);
            if (inputRegCellphone(scanner())) {
                notebook.setCellphone2(notebook.getTemp());
                inp = true;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputEmail() {

        while (inp) {
            view.printMessage(View.INPUT_EMAIL);
            if (inputRegEmail(scanner())) {
                notebook.setEmail(notebook.getTemp());
                inp = false;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputSkype() {

        while (!inp) {
            view.printMessage(View.INPUT_SKYPE);
            if (inputRegTextAndNumberShort(scanner())) {
                notebook.setSkype(notebook.getTemp());
                inp = true;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetInputGroup() {

        while (inp) {
            view.printMessage(View.INPUT_GROUP);
            if (inputRegGroup(scanner())) {
                notebook.setGroup(Group.valueOf(notebook.getTemp()));
                inp = false;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }


    public void chekSetInputData() {

        while (!inp) {
            view.printMessage(View.INPUT_DATA);
            if (inputRegData(scanner())) {
                notebook.setData(notebook.getTemp());
                inp = true;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }

    public void chekSetChangeData() {

        while (inp) {
            view.printMessage(View.INPUT_CHANGE_DATA);
            if (inputRegData(scanner())) {
                notebook.setDataOfChange(notebook.getTemp());
                inp = false;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }


    public void chekSetAdress() {

        while (!inp) {
            view.printMessage(View.INPUT_ADRESS);
            if (inputRegAdress(scanner())) {
                notebook.setAdress(new Adress(notebook.getTemp()));
                inp = true;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
    }









    public boolean inputRegText(String text) {
        if (text.matches(REG_TEXT)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_TEXT);
    }

    public boolean inputRegTextAndNumberShort(String text) {
        if (text.matches(REG_TEXT_AND_NUMBER_SHORT)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_TEXT_AND_NUMBER_SHORT);
    }

    public boolean inputRegTextAndNumberAndSymbol(String text) {
        if (text.matches(REG_TEXT_AND_NUMBER_AND_SYMBOL)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_TEXT_AND_NUMBER_AND_SYMBOL);
    }

    public boolean inputRegHomephone(String text) {
        if (text.matches(REG_HOMEPHONE)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_HOMEPHONE);
    }

    public boolean inputRegCellphone(String text) {
        if (text.matches(REG_CELLPHONE)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_CELLPHONE);
    }

    public boolean inputRegEmail(String text) {
        if (text.matches(REG_EMAIL)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_EMAIL);
    }

    public boolean inputRegGroup(String text) {
        if (text.matches(REG_GROUP)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_GROUP);
    }

    public boolean inputRegData(String text) {
        if (text.matches(REG_DATA)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_DATA);
    }

    public boolean inputRegAdress(String text) {
        if (text.matches(REG_ADRESS)) {
            notebook.setTemp(text);
        }
        return text.matches(REG_ADRESS);
    }













    public String scanner() {
        Scanner src = new Scanner(System.in);
        String inputText = src.nextLine();
        return inputText;
    }
}
