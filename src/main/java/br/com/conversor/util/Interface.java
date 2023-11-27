package br.com.conversor.util;

public class Interface {
    public static void menuConversao(){
        System.out.println("-------Escolha o que deseja converter-------");
        System.out.println("1: Volume");
        System.out.println("2: Massa");
        System.out.println("3: Distância");
        System.out.println("--------------------------------------------");
    }

    public static void menuVolume(){
        System.out.println("-----Digite a opção desejada-----");
        System.out.println("1: Litros para Metro Cúbido");
        System.out.println("2: Metro Cúbico para Litros");
        System.out.println("---------------------------------");
    }
    public static void menuMassa(){
        System.out.println("-----Digite a opção desejada-----");
        System.out.println("1: Kilogramas para Gramas");
        System.out.println("2: Gramas para kilogramas");
        System.out.println("---------------------------------");
    }
    public static void menuDistancia(){
        System.out.println("-----Digite a opção desejada-----");
        System.out.println("1: Metros para Quilômetros");
        System.out.println("2: Quilômetros para metros");
        System.out.println("---------------------------------");
    }

}
