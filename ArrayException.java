package gr.aueb.cf.ch7;

public class ArrayException {

    public static void main(String[] args) {


        try {
            int [] grades = {6,8,9};
            System.out.println(grades[10]);
        } catch (Exception e){
            System.out.println("something went wrong");
            //System.exit(1);
        } finally {
            System.out.println("the 'try - catch' has finished");
        }


    }
}
