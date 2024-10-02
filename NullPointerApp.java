package gr.aueb.cf.ch7;

public class NullPointerApp {

    public static void main(String[] args) {
        String s = null;

        if ( s == null) {
            System.out.println("String is null");
            return;
        }

        if (s.equals("Athens")) {
            System.out.println("Equals");
        }
    }
}
