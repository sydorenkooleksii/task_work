package ua.epam.controller;

import ua.epam.View;
import ua.epam.model.Model;
import ua.epam.model.entity.Adress;
import ua.epam.model.entity.Group;

import java.util.Scanner;

/**
 * Created by Oleksii_Sydorenko on 9/22/2016.
 */
public class Controller {


    View view = new View();
    Model model = new Model();


    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNotebook inputNotebook = new InputNotebook();

        inputNotebook.setName(inputIntValueWithScanner(sc,view.INPUT_NAME,view.INPUT_WRONG,RegEx.REG_TEXT));
        inputNotebook.setSurname(inputIntValueWithScanner(sc,view.INPUT_SURNAME,view.INPUT_WRONG,RegEx.REG_TEXT));
        inputNotebook.setDaddyname(inputIntValueWithScanner(sc,view.INPUT_DADDYNAME,view.INPUT_WRONG,RegEx.REG_TEXT));
        inputNotebook.setNickname(inputIntValueWithScanner(sc,view.INPUT_NICKNAME,view.INPUT_WRONG,RegEx.REG_TEXT_AND_NUMBER_SHORT));
        inputNotebook.setComment(inputIntValueWithScanner(sc,view.INPUT_COMMENT,view.INPUT_WRONG,RegEx.REG_TEXT_AND_NUMBER_AND_SYMBOL ));
        inputNotebook.setHomephone(inputIntValueWithScanner(sc,view.INPUT_HOMEPHONE,view.INPUT_WRONG,RegEx.REG_HOMEPHONE));
        inputNotebook.setCellphone(inputIntValueWithScanner(sc,view.INPUT_CELLPHONE,view.INPUT_WRONG,RegEx.REG_CELLPHONE));
        inputNotebook.setCellphone2(inputIntValueWithScanner(sc,view.INPUT_CELLPHONE2,view.INPUT_WRONG,RegEx.REG_CELLPHONE));
        inputNotebook.setEmail(inputIntValueWithScanner(sc,view.INPUT_EMAIL,view.INPUT_WRONG,RegEx.REG_EMAIL));
        inputNotebook.setSkype(inputIntValueWithScanner(sc,view.INPUT_SKYPE,view.INPUT_WRONG,RegEx.REG_TEXT_AND_NUMBER_SHORT));
        inputNotebook.setData(inputIntValueWithScanner(sc,view.INPUT_DATA,view.INPUT_WRONG,RegEx.REG_DATA));
        inputNotebook.setDataOfChange(inputIntValueWithScanner(sc,view.INPUT_CHANGE_DATA,view.INPUT_WRONG,RegEx.REG_DATA));
        inputNotebook.setGroup(Group.valueOf(inputIntValueWithScanner(sc,view.INPUT_GROUP,view.INPUT_WRONG,RegEx.REG_GROUP)));
        inputNotebook.setAdress(new Adress(inputIntValueWithScanner(sc,view.INPUT_ADRESS,view.INPUT_WRONG,RegEx.REG_ADRESS)));


        view.printMessage(
        model.createConstructorNotebook(inputNotebook.getName(),
                inputNotebook.getSurname(),
                inputNotebook.getDaddyname(),
                inputNotebook.getNickname(),
                inputNotebook.getComment(),
                inputNotebook.getHomephone(),
                inputNotebook.getCellphone(),
                inputNotebook.getCellphone2(),
                inputNotebook.getEmail(),
                inputNotebook.getSkype(),
                inputNotebook.getData(),
                inputNotebook.getDataOfChange(),
                inputNotebook.getGroup(),
                inputNotebook.getAdress()).toString());


    }



    public String inputIntValueWithScanner(Scanner sc, String input, String wrong, String regex) {

        boolean ok = true;
        String res = "";
        while (ok) {

            view.printMessage(input);
            while (!sc.hasNextLine()) {

                view.printMessage(input);
                sc.next();
            }
            res = sc.nextLine();
           if (res.matches(regex)) {
               ok = false;
           }
           else {
               view.printMessage(wrong);
           }
       }
        return res;
    }


}
