package gr.aueb.cf.ch7;
import java.io.IOException;

public class ThrowsVsTryCatch {

    public static void main(String[] args) {

        try{
            char ch = (char) System.in.read();
        } catch (IOException e){
            System.out.println("IO Exception");
        }
    }
}
