package gr.aueb.cf.ch7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyApp {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("/Users/vasiliskr/Pictures/FocusContact.jpg");
            FileOutputStream fos = new FileOutputStream("/Users/vasiliskr/Pictures/FocusContact_Out.jpg")){

            int b;
            int count = 0;
            long start;
            long end;
            double elapsedTime = 0.0;

            start = System.currentTimeMillis();

            while ((b = fis.read()) != -1) {
                fos.write(b);
                count++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;
            System.out.printf("file with size %d KB, copied succesfull \n", (count / 1024));
            System.out.println("the time is spent is : " + elapsedTime + " seconds");


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
