package gr.aueb.cf.ch7;

public class SplitApp {

    public static void main(String[] args) {

        String s = "Athens          of Uni of Econ and Business";

        String [] tokens = s.split(" +");   //αναγνωρίζει τα κενά και δεν τα εκτυπώνει

        for (String token : tokens){
            System.out.println(token);
        }
    }
}
