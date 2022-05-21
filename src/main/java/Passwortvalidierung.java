import java.util.Scanner;

public class Passwortvalidierung {

    public static void main(String[] args) {

        String[] passwords = {"test", "Test123", "NeuerVersuch", "GuteSpielertragendie7und17"};
        Scanner scanner = new Scanner(System.in);
        //multiChecker(passwords);

        System.out.println(passwordChecker(scanner.next()));

    }
    public static String passwordChecker(String password){
        boolean maxLength = true;
        boolean number = true;
        boolean lowerCase = true;
        boolean upperCase = true;
        if (stringCheckerLength(password) < 8){
            maxLength = false;
        }
        if (stringCheckerNumber(password) < 1){
            number = false;
        }
        if (stringCheckerLowerCase(password) == 0){
            lowerCase = false;
        }
        if (stringCheckerUpperCase(password) == 0){
            upperCase = false;
        }
        if (maxLength == false || number == false || lowerCase == false || upperCase == false ){
            String mistakes = "";
            if (maxLength == false){
                mistakes = "Das Passwort ist zu kurz. ";
            }
            if (number == false){
                mistakes = mistakes + "Das Passwort enthält keine Zahl. ";
            }
            if (lowerCase == false){
                mistakes = mistakes + "Das Passwort enthält keinen Kleinbuchstaben. ";
            }
            if (upperCase == false){
                mistakes = mistakes + "Das Passwort enthält keinen Großbuchstaben.";
            }
            return mistakes;
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
