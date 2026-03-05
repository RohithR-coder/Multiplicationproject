import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    void testMultiply() {
        Multiplication multi = new Multiplication();
        assertEquals(10, multi.multiply(2, 5));
    }
}
