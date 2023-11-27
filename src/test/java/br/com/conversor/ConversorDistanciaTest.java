package br.com.conversor;

import br.com.conversor.util.Distancia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ConversorDistanciaTest {
        Distancia distancia = new Distancia();

    @Test
    @DisplayName("Converte Km para metro")
    public void converteKmParaMetro(){
        assertEquals(1000, distancia.quilometroParaMetros(1), 0.1);
        assertEquals(2000, distancia.quilometroParaMetros(2), 0.1);
        assertEquals(3500, distancia.quilometroParaMetros(3.5), 0.1);
    }
    @Test
    @DisplayName("Converte Metro para Km")
    public void converteMetroParaKm(){
        assertEquals(1.0,distancia.metrosParaQuilometro(1000),0.1);
        assertEquals(3.5,distancia.metrosParaQuilometro(3500),0.1);
        assertEquals(7.0,distancia.metrosParaQuilometro(7000),0.1);
    }

}
