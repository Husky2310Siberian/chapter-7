package gr.aueb.cf.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileExceptionApp {

    public static void main(String[] args) throws FileNotFoundException {
        int num = 0;
        try{
            num = getNum();
            System.out.println("Num = " + num);
        }   catch (FileNotFoundException | InputMismatchException | IllegalStateException e){
            System.out.println(e.getMessage());
            //e.printStackTrace(); // only for development phase
        }
    }

    public static int getNum() throws FileNotFoundException, InputMismatchException , IllegalStateException{ // στο throws γράφουμε μόνο τα checked Exceptions ( the first one in our case, the other two are unchecked)
        File fd = new File ("C:/tmp/file.txt");
        int num = 0; //η αρχικοποιήση , συνδυάζεται με το return στο τέλος

        try (Scanner in = new Scanner(fd)){
            num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException | IllegalStateException e){     // one of the two exceptions
            System.err.println("Error. File not found");
            //e.printStackTrace(); // απο εδώ βλεπουμε το περιεχόμενο και τη ροή του λάθους
            throw e;        // το λάθος

        }
        return num;
    }
}
