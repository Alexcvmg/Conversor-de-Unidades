package br.com.conversor.util;

public class Massa {
    public double kilosParaGramas(double kilos){
        if(kilos < 0){
            throw new IllegalArgumentException("Massa não pode ser negativa");
        }
        return kilos * 1000;
    }
    public double gramasParaKilos(double gramas){
        if(gramas < 0){
            throw new IllegalArgumentException("Massa não pode ser negativa");
        }
        return gramas/1000;
    }
}
