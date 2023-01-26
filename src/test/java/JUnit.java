import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyTests{
    @Test
    public void miltiplicationOfZero_one() {
        Features tester = new Features();
        assertEquals(0, tester.multiplicacion(10, 0), "10 x 0 debe ser 0");
    }
}
public class JUnit {

}
