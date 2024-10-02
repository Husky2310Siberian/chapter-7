package gr.aueb.cf.ch7;

import java.io.*;

public class ExerciseLatitudeLongitude {

    public static void main(String[] args) {

        String inPutFile = "/Users/vasiliskr/Downloads/Downloads/Test_Longitude_Latitude.txt";
        String outPutFile = "/Users/vasiliskr/Downloads/Downloads/Test_Longitude_Latitude_OutPut.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(inPutFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outPutFile))) {

            String line = "";
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split(",");
                if(parts.length == 3)
                {
                    String location = parts[0];
                    String latitude = parts[1];
                    String longitude = parts[2];

                    String newFormat = String.format("{location: %s , latitude: %s, longitude: %s}",
                                                                location, latitude, longitude);
                    bw.write(newFormat);
                    bw.newLine();
                }
                //System.out.println("the new format is copied");
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
