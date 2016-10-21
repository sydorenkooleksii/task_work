package ua.ep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here


        for (int i = 0; i < 10; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter integer:");
            int n = scanner.nextInt();
            Factorial factorial = new Factorial(n);
            factorial.start();

        }
    }
}


class Factorial extends Thread {
    int input;

    public Factorial(int input) {
        this.input = input;
    }

    @Override
    public void run() {

        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        calculate();
    }

    public  void calculate() {
        long result = 1;

        if (input == 0 || input == 1) {
            System.out.println(result);
        }
        if (input < 0) {
            System.out.println("Integer must be greater than 0");
        }
        for (int k = 2; k <= input; k++) {
            result *= k;
        }
        synchronized (System.out) {
            System.out.println("Factorial of number " + input + " is : " + result);
        }
    }
}