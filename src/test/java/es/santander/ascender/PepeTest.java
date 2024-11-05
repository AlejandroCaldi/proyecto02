package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PepeTest {
    @Test
    public void testSumar() {
        Pepe cut = new Pepe();

        float prueba = cut.sumar(4,3);
        
        assertTrue(prueba==7f);
    } 
     
}
