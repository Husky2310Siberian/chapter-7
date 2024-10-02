package gr.aueb.cf.ch7;

public class ExerciseCryptography {

    public static void main(String[] args) {

        String s1 = "Hello World - Hello AUEB";
        String encrypt = getEncrypted(s1);

        String s2 = "Ifmmp!Xpsme!.!Ifmmp!BVFC";
        String decrypt = getDecrypted(s2);

        System.out.println("the initial string is : " + s1);
        System.out.println("the encrypted string is : " +encrypt);

        System.out.println(" ");

        System.out.println("the decrypted string is : " + s2);
        System.out.println("the encrypted string is : " +decrypt);
    }

    public static String getEncrypted(String text){

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            encrypted.append((char)(c + 1));
        }
            return encrypted.toString();
    }

    public static String getDecrypted(String text) {

        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            decrypted.append((char)(c - 1));
        }
        return decrypted.toString();
    }
}
