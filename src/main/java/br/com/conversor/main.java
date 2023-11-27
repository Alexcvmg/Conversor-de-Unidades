package br.com.conversor;
import br.com.conversor.util.Distancia;
import br.com.conversor.util.Massa;
import br.com.conversor.util.Volume;

import static br.com.conversor.util.Interface.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        menuConversao();
        int escolha = sc.nextInt();
        if (escolha == 1) {
            Volume volume = new Volume();
            menuVolume();
            escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Qual o valor deseja converter?");
                valor = sc.nextDouble();
                System.out.println(volume.litrosParaMetrosCubicos(valor) + "m³");
            } else {
                System.out.println("Qual o valor deseja converter?");
                valor = sc.nextDouble();
                System.out.println(volume.metrosCubicosParaLitros(valor) + "l");

            }
        } else if (escolha == 2) {
            Massa massa = new Massa();
            menuMassa();
            escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Qual o valor deseja converter?");
                valor = sc.nextDouble();
                System.out.println(massa.kilosParaGramas(valor) + "g");

            } else {
                System.out.println("Qual o valor deseja converter?");
                valor = sc.nextDouble();
                System.out.println(massa.gramasParaKilos(valor) + "Kg");

            }
        } else {
            Distancia distancia = new Distancia();
            menuDistancia();
            escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Qual o valor deseja converter?");
                valor = sc.nextDouble();
                System.out.println(distancia.metrosParaQuilometro(valor) + "Km");

            } else {
                System.out.println("Qual o valor deseja converter?");
                valor = sc.nextDouble();
                System.out.println(distancia.quilometroParaMetros(valor) + "m");

            }


        }
    }
}
