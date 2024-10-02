package gr.aueb.cf.ch7;

public class IndexOutoFBoundsApp {

    public static void main(String[] args) {
        int [] arr = new int [10];

        for (int i = 0; i < arr.length; i++) {  // i cant do recover, i just correct the fault in i<arr.length
            System.out.print(arr[i]);
        }
    }


}
