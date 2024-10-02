package gr.aueb.cf.ch7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while(true) {
            try {
                System.out.println("please insert two numbers");
                numerator = in.nextInt();
                denominator = in.nextInt();

                if( numerator == 0) {
                    break;
                }
                result = numerator / denominator;
                System.out.printf("%d / %d = %d\n", numerator , denominator, result );

            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("Error . Denominator can not be zero");
               // return; // with return, does not allow to program to print the next order
            }   catch (InputMismatchException e){
                in.nextLine(); // recover
                System.out.println("Error. Please Insert integers");
                //break;
            }
                //System.out.println("thanks for using");
            }



    }
}
