import org.junit.Test;
import static org.junit.Assert.*;

public class TestValidator {
    @Test
    public void testUsernameTooLong(){
        System.out.println("Testing username too long");
        String username = "Martineeeeee";
        Validator validator = new Validator();

        Boolean result = validator.username_is_valid(username);

        assertFalse(result);

    }

    @Test
    public void testUsernameWithSpace(){
        System.out.println("Testing username with space fails");
        String username = "Mart ine";
        Validator validator = new Validator();

        Boolean result = validator.username_is_valid(username);

        assertFalse(result);

    }

    @Test
    public void testUsernameEmpty(){
        System.out.println("Testing username fails if its blank");
        String username = "";
        Validator validator = new Validator();

        Boolean result = validator.username_is_valid(username);

        assertFalse(result);

    }

    @Test
    public void testUsernamePassesWhenRight(){
        System.out.println("Testing username passes when right");
        String username = "Martine";
        Validator validator = new Validator();

        Boolean result = validator.username_is_valid(username);

        assertTrue(result);

    }




}