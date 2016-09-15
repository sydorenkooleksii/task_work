package ua.epam;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {





    public static void main(String[] args) {

        Game a = new Game();

        try {
            a.rand(3,99);
        }
        catch (InputMismatchException e) {
            System.out.println("Please, be careful and enter integer");
        }
    }
}
