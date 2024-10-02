package gr.aueb.cf.ch7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExerciseMenuExceptions {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "";

        while (true){
            printMenu();
            s = getChoice();
            if(s.matches("5")) break;
            try{
                printChoice(s);
            } catch (IllegalArgumentException e){
                System.out.println("Invalid choice : " + s);
            }
        }
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ενα απο τα παρακάτω");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5. Exit");
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }

    public static void printChoice (String s) throws IllegalArgumentException{
        int choice = 0;

        try{
            choice = Integer.parseInt(s);
            if(!isValid(choice)){
                throw new IllegalArgumentException();
            }
            System.out.println("choice : " + s);
        }catch (IllegalArgumentException e){
            log(e);
            throw(e);
        }
    }

    public static boolean isValid (int choice) {
        return (choice >= 1 ) && (choice <= 4);
    }

    public static void log(Exception e){
        Path path = Paths.get("C:/tmp/log.txt");

        try(PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))){
            ps.println(LocalDateTime.now() + "\n" + e);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
