import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswortvalidierungTest {

    @Test
    void ShouldBeSafe(){
        //Given
        String password = "Test1234";
        //When
        String actual = Passwortvalidierung.passwordChecker(password);
        //Then
        Assertions.assertEquals("Das Passwort ist Sicher", actual);
    }

    @Test
    void ShouldBeNotSafeCauseNoNumbers(){
        //Given
        String password = "Testtest";
        //When
        String actual = Passwortvalidierung.passwordChecker(password);
        //Then
        Assertions.assertEquals("Das Passwort enthält keine Zahl. ", actual);
    }

    @Test
    void ShouldBeNotSafeCauseNoLowerCase(){
        //Given
        String password = "testtest";
        //When
        String actual = Passwortvalidierung.passwordChecker(password);
        //Then
        Assertions.assertEquals("Das Passwort enthält keine Zahl. Das Passwort enthält keinen Großbuchstaben.", actual);
    }
    @Test
    void ShouldBeNotSafeCauseToShort(){
        //Given
        String password = "Test";
        //When
        String actual = Passwortvalidierung.passwordChecker(password);
        //Then
        Assertions.assertEquals("Das Passwort ist zu kurz. Das Passwort enthält keine Zahl. ", actual);
    }


}
