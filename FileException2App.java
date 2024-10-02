package gr.aueb.cf.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileException2App {

    public static void main(String[] args) {
        //int num = 0;

        try {
            int num = getNum();
            System.out.println("num = : " + num);
        } catch (FileNotFoundException e){
            System.err.println("File not Found"); // prints with red color the exception
        } catch (InputMismatchException e) {
            System.out.println("Error reading");
        } catch (ArithmeticException e) {
            System.out.println("Error. Negative number");
        }
    }

    public static int getNum () throws FileNotFoundException, ArithmeticException, InputMismatchException{
        File fd = new File("C:/tmp/file.txt");
        int num = 0;

        try (Scanner in = new Scanner(fd)){

            if(!in.hasNextInt()) {      // it is user Exception (inside try, with if)
                throw  new InputMismatchException();
            }

            num = in.nextInt();

            if ( num < 0) { //it is user Exception (inside try, with if)
                throw new ArithmeticException("Negative num");
            }

        } catch (FileNotFoundException | ArithmeticException | InputMismatchException e){
            e.printStackTrace();
            throw e;
        }
        return num;
    }
}
