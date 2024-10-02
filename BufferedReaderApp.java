package gr.aueb.cf.ch7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String line;

        try (BufferedReader bf = new BufferedReader(new FileReader("/Users/vasiliskr/Downloads/part-00000-tid-3193909637866310192-e7b60620-29df-46ed-95f3-eac524afd466-208-1-c000.csv"))){

            while((line = bf.readLine()) != null) {

                sb.append(line).append("\n");
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
