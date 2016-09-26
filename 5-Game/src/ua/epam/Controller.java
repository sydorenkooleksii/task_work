package ua.epam;

import java.util.Scanner;
import java.util.Random;


public class Controller {

    View view;
    Model model;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setWinValue();
        model.setValue(inputIntValueWithScanner(sc));
        view.printMessage(view.WIN);
    }


    public int inputIntValueWithScanner(Scanner sc) {
        int res=0;
        boolean game = true;
        view.printMessageAndInt(view.INPUT_INT_DATA,model.getMinBarrier());
        view.printMessageAndInt(view.AND,model.getMaxBarrier());
        view.printEmpty();
        while(game) {

            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT);
                view.printMessageAndInt(view.INPUT_INT_DATA,model.getMinBarrier());
                view.printMessageAndInt(view.AND,model.getMaxBarrier());
                view.printEmpty();
                sc.next();
            }

            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(view.WRONG_INPUT);
                view.printMessageAndInt(view.INPUT_INT_DATA,model.getMinBarrier());
                view.printMessageAndInt(view.AND,model.getMaxBarrier());
                view.printEmpty();
                continue;
            }
                else  {
                    game = model.checkInputValue(res,game);
                }
            }
        return res;
    }

}























