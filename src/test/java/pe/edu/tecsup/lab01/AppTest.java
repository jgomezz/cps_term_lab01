package pe.edu.tecsup.lab01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        final String EXPECTED = "!aloH";
        String actual = app.reverseString("Hola!");
        //validate
        assertEquals(EXPECTED,actual);
    }
}
