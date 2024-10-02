package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StateTestingArithmException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        numerator = sc.nextInt();
        denominator = sc.nextInt();

        if ( denominator == 0){
            System.out.println("Error. Denominator can not be zero");
            System.exit(1);
        }

        result = numerator / denominator;

        System.out.printf("%d / %d = %d", numerator , denominator, result );

    }
}
