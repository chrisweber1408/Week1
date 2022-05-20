import java.util.Scanner;

public class Passwortvalidierung {

    public static void main(String[] args) {

        String[] passwords = {"test", "Test123", "NeuerVersuch", "GuteSpielertragendie7und17"};
        Scanner scanner = new Scanner(System.in);
        multiChecker(passwords);

        System.out.println(passwordChecker(scanner.next()));

    }
    public static String passwordChecker(String password){
        if (stringCheckerLength(password) < 8){
            return "Das Passwort ist nicht Sicher";
        }
        if (stringCheckerNumber(password) < 1){
            return "Das Passwort ist nicht Sicher";
        }
        if (stringCheckerLowerCase(password) == 0){
            return "Das Passwort ist nicht Sicher";
        }
        if (stringCheckerUpperCase(password) == 0){
            return "Das Passwort ist nicht Sicher";
        }
        return "Das Passwort ist Sicher";

    }
    public static int stringCheckerLength(String password){
        int maxLength = 0;
        maxLength = password.length();
        return maxLength;
    }
    public static int stringCheckerUpperCase(String password){
        int checkUpperCase = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                checkUpperCase += 1;
            }
        }
        return checkUpperCase;
    }
    public static int stringCheckerLowerCase(String password){
        int checkLowerCase = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)){
                checkLowerCase += 1;
            }
        }
        return checkLowerCase;
    }
    public static int stringCheckerNumber(String password) {
        int checkNumber = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                checkNumber += 1;
            }
        }
        return checkNumber;
    }
    public static void multiChecker(String[] passwords){
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(passwordChecker(passwords[i]));
        }
    }

}
