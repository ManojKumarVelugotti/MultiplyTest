import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UtilsTest {
    @Test
    void testMultiply(){
        int first = 40;
        int second = 50;
        int response;
        Utils utilsObj = new Utils();
        response = utilsObj.multiply(first,second);
        Assertions.assertEquals(2000, response);

    }
}
