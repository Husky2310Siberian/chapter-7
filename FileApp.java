package gr.aueb.cf.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) throws IOException {

        File fd = new File("/Users/vasiliskr/Downloads/Αναφορα Αzure Cloud.pdf");
        String line;
        String[] tokes;


        try (Scanner sc = new Scanner(fd)){
            while(sc.hasNextInt()) {
                line = sc.nextLine();
                tokes = line.split(" +");

                for (String tokens : tokes){
                    System.out.println(tokens + " ");
                }
                System.out.println();
            }


        }   catch (IOException e){
            e.printStackTrace();
        }
    }
}