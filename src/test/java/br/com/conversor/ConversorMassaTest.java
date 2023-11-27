package br.com.conversor;

import br.com.conversor.util.Massa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorMassaTest {
    @Test
    @DisplayName("Conversor de Kg para gramas")
    public void quilosParaGramas(){
        Massa massa = new Massa();

        assertEquals(2000,massa.kilosParaGramas(2),0.01);
        assertEquals(3000,massa.kilosParaGramas(3),0.01);
        assertThrows(IllegalArgumentException.class, () -> {
                assertEquals(-5000,massa.kilosParaGramas(-5),0.01);
        });
    }
    @Test
    @DisplayName("Conversor de Gramas para Kg")
    public void gramasParaQuilos(){
        Massa massa = new Massa();
        assertEquals(1,massa.gramasParaKilos(1000),0.1);
        assertEquals(2,massa.gramasParaKilos(2000),0.1);
        assertEquals(3,massa.gramasParaKilos(3000),0.1);

    }
}
