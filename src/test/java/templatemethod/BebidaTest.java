package templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BebidaTest {

    @Test
    void devePrepararCafe() {
        Bebida bebida = new Cafe();

        assertDoesNotThrow(() -> bebida.preparar());
    }

    @Test
    void devePrepararCha() {
        Bebida bebida = new Cha();

        assertDoesNotThrow(() -> bebida.preparar());
    }
}