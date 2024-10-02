package gr.aueb.cf.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/tmp/file.txt");

        try (Scanner in = new Scanner(file)) {
            char ch = (char) System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e) {        //ειδική περίπτωση exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {                //γενική περίπτσσωη exception που υπερκαλύπτει την απο πάνω
            System.out.println("IO Exception");
        }
    }
}
