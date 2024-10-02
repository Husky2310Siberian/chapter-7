package gr.aueb.cf.ch7;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOut2App {

    public static void main(String[] args) {
        File inFd = new File("/Users/vasiliskr/Downloads/part-00000-tid-3193909637866310192-e7b60620-29df-46ed-95f3-eac524afd466-208-1-c000.csv");
        File outFd = new File("/Users/vasiliskr/Downloads/part-00000-tid-3193909637866310192-e7b60620-29df-46ed-95f3-eac524afd466-208-1-c000_Out.csv");
        String line;
        String [] tokens;

        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while(in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token : tokens) {
                    ps.printf("%s ", token);
                    ps.flush();
                }
                ps.println();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
