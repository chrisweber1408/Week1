import java.util.Scanner;

public class Passwortvalidierung {

    public static void main(String[] args) {

        String[] passwords = {"test", "Test123", "NeuerVersuch", "GuteSpielertragendie7und17"};
        Scanner scanner = new Scanner(System.in);
        //multiChecker(passwords);

        //System.out.println(passwordChecker(scanner.next()));

    }
    public static String passwordChecker(String password){
        if(password.length() > 7){
            if(stringCheckerUppercase(password)) {
                if(stringCheckerNumber(password)) {
                    return "Das Passwort funktioniert!";
                }
            }
        }
        return "Das Passwort ist ungültig";
    }

    public static boolean stringCheckerUppercase(String password){
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
    public static boolean stringCheckerNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void multiChecker(String[] passwords){
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(passwordChecker(passwords[i]));
        }
    }

}
