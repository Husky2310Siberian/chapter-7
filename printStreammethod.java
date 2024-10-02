package gr.aueb.cf.ch7;

import java.io.IOException;
import java.io.PrintStream;

public class printStreammethod {

    public static void main(String[] args) {

        try {
            PrintStream ps = new PrintStream("/Users/vasiliskr/Downloads/part-00000-tid-3193909637866310192-e7b60620-29df-46ed-95f3-eac524afd466-208-1-c000.csv");

            printMessage(ps, "AUEB - CF");
            printMessage(System.out, "Hello cf!!");

        }  catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param ps        the PrintStream
     * @param message   the message to print
     */
    public static void printMessage (PrintStream ps, String message){
        ps.println(message);
    }
}
