package ua.epam;

public class View {

    public static final String INPUT_INT_DATA = " Enter integer between ";
    public static final String AND = " and ";
    public static final String WIN = " Congratulations you win! ";
    public static final String WRONG_INPUT = " You enter wrong value. Please, be careful.";



    public void printMessage(String message){
        System.out.println(message);
    }
    public void printEmpty(){
        System.out.println();
    }
    public void printMessageAndInt(String message, int value){
        System.out.print(message + value);
    }
}


