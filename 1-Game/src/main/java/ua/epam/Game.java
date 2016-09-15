package ua.epam;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Game {

    public void rand(int min, int max){
        int RAND_MAX = 100;
        int result;
        int randMax = (max <= RAND_MAX) ? max :  RAND_MAX;
        int randMin = (min >= 0) ? min :  0;
        int [] arrayEnterTry = new int [100];
        int j=0;

        if (randMax<randMin){
            int temp = randMax;
            randMax = randMin;
            randMin = temp;
        }
        result = randRandom(randMin,randMax);
        System.out.println("Integer for win: "+result);
        randPrint(randMin,randMax);
        randScan (arrayEnterTry, result, randMin, randMax, j);
    }

    public void rand(){
        int RAND_MAX = 100;
        int result;
        int randMax = RAND_MAX;
        int randMin = 0;
        int [] arrayEnterTry = new int [100];
        int j=0;

        if (randMax<randMin){
            int temp = randMax;
            randMax = randMin;
            randMin = temp;
        }
        result = randRandom(randMin,randMax);
        System.out.println("Integer for win: "+result);
        randPrint(randMin,randMax);
        randScan (arrayEnterTry, result, randMin, randMax, j);
    }






    private void randScan (int [] arrayEnterTry, int result,int randMin, int randMax,int j){

        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arrayEnterTry.length;i++ ){
            int customerInput = sc.nextInt();
            if (customerInput == result){
                System.out.println("Congratulations you win");
                randPrintAtt(arrayEnterTry,j);
                break;
            }else {
                if (customerInput > randMin & customerInput < result) {
                    randMin = customerInput;
                    randPrint(randMin,randMax);
                    arrayEnterTry[j++]=customerInput;
                    randPrintAtt(arrayEnterTry,j);
                } else {
                    if (customerInput > result & customerInput < randMax) {
                        randMax = customerInput;
                        randPrint(randMin,randMax);
                        arrayEnterTry[j++]=customerInput;
                        randPrintAtt(arrayEnterTry,j);
                    }
                    else{
                        randPrint(randMin, randMax);
                    }
                }
            }
        }
    }

    private int randRandom(int randMin, int randMax){
        int randMinRes = (randMin<=0)? 1 : randMin;
        int result =  randMinRes + (int)(Math.random() * ((randMax - randMin) + 1));
        return result ;
    }

    private void randPrint(int randMin, int randMax) {
        System.out.println("Enter integer between " + randMin + " and " + randMax);
    }

private void randPrintAtt(int [] arrayEnterTry,int j){
    System.out.print("Previous attempts:");
    for (int k=0; k<j;k++){
        System.out.print(arrayEnterTry[k] + ",");
    }
}


}
