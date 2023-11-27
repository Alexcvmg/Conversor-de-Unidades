package br.com.conversor;

import br.com.conversor.util.Volume;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorVolumeTest {
    @Test
    @DisplayName("Converter de litros para m³")
    public void litrosParaMetroCubico(){
      Volume  litros = new Volume();
      assertEquals(0.5,litros.litrosParaMetrosCubicos(500),0.1);
      assertEquals(1.5,litros.litrosParaMetrosCubicos(1500),0.1);
      assertEquals(2.5,litros.litrosParaMetrosCubicos(2500),0.1);

    }

    @Test
    @DisplayName("Converter m³ para litros")
    public void metrosCubicosParaLitros(){
        Volume metrosCubicos = new Volume();
        assertEquals(1500,metrosCubicos.metrosCubicosParaLitros(1.5));
        assertEquals(2500,metrosCubicos.metrosCubicosParaLitros(2.5));
        assertEquals(3500,metrosCubicos.metrosCubicosParaLitros(3.5));
    }
}
