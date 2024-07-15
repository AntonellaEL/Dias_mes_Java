package dev.anto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiasDelMesTest {
 
    @Test
    public void testDiasMesFebrero() {
        DiasDelMes diasDelMes = new DiasDelMes(2);
        assertEquals(28, diasDelMes.getNumDias());
    }
}