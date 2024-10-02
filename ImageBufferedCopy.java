package gr.aueb.cf.ch7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class ImageBufferedCopy {

    public static void main(String[] args) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/vasiliskr/Pictures/FocusContact.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/vasiliskr/Pictures/FocusContact_Out.jpg")) ){

            int b;
            int count = 0;
            long start;
            long end;
            double elapsedTime = 0.0;
            byte[] buf = new byte[4096];

            start = System.currentTimeMillis();

            while ((b = bis.read(buf, 0, buf.length)) != -1) {
                bos.write(buf, 0 , b);
                count += b;
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
