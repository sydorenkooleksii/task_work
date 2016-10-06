package ua.ep.excel;

/**
 * Created by Oleksii_Sydorenko on 10/5/2016.
 */
public class Runner {


    public static void main(String[] args){
        String file = "src\\main\\resources\\Student.xls";
        System.out.println(Parser.parse(file));
    }
}
