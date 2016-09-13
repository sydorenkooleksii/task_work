package ua.epam;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void rand(int min, int max){
        int RAND_MAX = 100;
        int result;
        int randmax = (max <= RAND_MAX) ? max :  RAND_MAX;
        int randmin = (min >= 0) ? min :  0;
        result =  randmin + (int)(Math.random() * ((randmax - randmin) + 1));
        if (randmax<randmin){
            int temp = randmax;
            randmax = randmin;
            randmin = temp;
        }
        int j=0;
        System.out.println("integer for win: "+result);
        int [] arrayentertry = new int [100];
        System.out.println("Enter integer between "+ randmin + " and " + randmax);
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arrayentertry.length;i++ ){
        int customerInput = sc.nextInt();
        if (customerInput == result){
            System.out.println("Congratulations you win! Your previous attempts: ");
            for (int k=0; k<j;k++){
                System.out.print(arrayentertry[k] + ",");
            }
            break;
        }else {
            if (customerInput > randmin & customerInput < result) {
                randmin = customerInput;
                System.out.println("Enter integer between "+ randmin + " and " + randmax + ". Previous attempts:");
                arrayentertry[j++]=customerInput;
                for (int k=0; k<j;k++){
                    System.out.print(arrayentertry[k] + ",");
                }
            } else {
                if (customerInput > result & customerInput < randmax) {
                    randmax = customerInput;
                    System.out.println("Enter integer between "+ randmin + " and " + randmax + ". Previous attempts:");
                    arrayentertry[j++]=customerInput;
                    for (int k=0; k<j;k++){
                        System.out.print(arrayentertry[k] + ",");
                    }
                }
                else{
                    System.out.println("Please, be careful and enter integer between "+ randmin + " and " + randmax);
                }
            }

        }
        }

    }

    public static void rand(){
        int RAND_MAX = 100;
        int result;
        int randmax = RAND_MAX;
        int randmin = 0;
        result =  randmin + (int)(Math.random() * ((randmax - randmin) + 1));
        int j=0;
        System.out.println("integer for win: "+result);
        int [] arrayentertry = new int [100];
        System.out.println("Enter integer between "+ randmin + " and " + randmax);
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arrayentertry.length;i++ ){
            int customerInput = sc.nextInt();
            if (customerInput == result){
                System.out.println("Congratulations you win! Your previous attempts: ");
                for (int k=0; k<j;k++){
                    System.out.print(arrayentertry[k] + ",");
                }
                break;
            }else {
                if (customerInput > randmin & customerInput < result) {
                    randmin = customerInput;
                    System.out.println("Enter integer between "+ randmin + " and " + randmax + ". Previous attempts:");
                    arrayentertry[j++]=customerInput;
                    for (int k=0; k<j;k++){
                        System.out.print(arrayentertry[k] + ",");
                    }
                } else {
                    if (customerInput > result & customerInput < randmax) {
                        randmax = customerInput;
                        System.out.println("Enter integer between "+ randmin + " and " + randmax + ". Previous attempts:");
                        arrayentertry[j++]=customerInput;
                        for (int k=0; k<j;k++){
                            System.out.print(arrayentertry[k] + ",");
                        }
                    }
                    else{
                        System.out.println("Please, be careful and enter integer between "+ randmin + " and " + randmax);
                    }
                }

            }
        }

    }




    public static void main(String[] args) {
        try {
            rand();
        }
        catch (InputMismatchException e) {
            System.out.println("Please, be careful and enter integer");
        }
    }
}
