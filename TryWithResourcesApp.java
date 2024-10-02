package gr.aueb.cf.ch7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        int num  = 0;

        //final Scanner in = new Scanner(System.in);


        // try with resourses , gives priority to first catch
        try (Scanner in = new Scanner(System.in)){ //does not need to use in.close()
            System.out.println("Insert a num");
            num = in.nextInt();
        } catch (InputMismatchException e){
            e.printStackTrace();    //finally exists from java and i don't need to write
        }
        // if i insert an exception in finally, this has priority,
    }
}
