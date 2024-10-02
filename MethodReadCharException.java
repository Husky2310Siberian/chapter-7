package gr.aueb.cf.ch7;

import java.io.IOException;

public class MethodReadCharException {

    public static void main(String[] args) {

        char ch;

        try {
            ch = readChar();
            System.out.println(ch);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("char read error");
        }
    }

    private static char readChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
