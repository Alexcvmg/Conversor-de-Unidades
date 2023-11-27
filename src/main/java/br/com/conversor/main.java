package br.com.conversor;

import br.com.conversor.util.Distancia;
import br.com.conversor.util.Massa;
import br.com.conversor.util.Volume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static br.com.conversor.util.Interface.*;
import java.util.Scanner;

public class main {
    private static final Logger LOGGER = LoggerFactory.getLogger(main.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        LOGGER.debug("Iniciando o programa de conversão.");
        menuConversao();
        int escolha = sc.nextInt();

        if (escolha == 1) {
            Volume volume = new Volume();
            menuVolume();
            escolha = sc.nextInt();
            if (escolha == 1) {
                LOGGER.info("Qual o valor deseja converter de litro para m³?");
                valor = sc.nextDouble();
                LOGGER.info(valor + " convertido é: " + volume.litrosParaMetrosCubicos(valor) + "m³");
            } else if (escolha == 2) {
                LOGGER.info("Qual o valor deseja converter de m³ para litro?");
                valor = sc.nextDouble();
                LOGGER.info(valor + " convertido é: " + volume.metrosCubicosParaLitros(valor) + "l");
            } else {
                LOGGER.error("Opção inválida para o numero: " + escolha);
            }
        } else if (escolha == 2) {
            Massa massa = new Massa();
            menuMassa();
            escolha = sc.nextInt();
            if (escolha == 1) {
                LOGGER.info("Qual o valor deseja converter Kg para g?");
                valor = sc.nextDouble();
                LOGGER.info(valor + " convertido é: " + massa.kilosParaGramas(valor) + "g");
            } else if (escolha == 2) {
                LOGGER.info("Qual o valor deseja converter de g para Kg?");
                valor = sc.nextDouble();
                LOGGER.info(valor + " convertido é: " + massa.gramasParaKilos(valor) + "Kg");
            } else {
                LOGGER.error("Opção inválida para o numero: " + escolha);
            }
        } else if (escolha == 3) {
            Distancia distancia = new Distancia();
            menuDistancia();
            escolha = sc.nextInt();
            if (escolha == 1) {
                LOGGER.info("Qual o valor deseja converter de m para Km?");
                valor = sc.nextDouble();
                LOGGER.info(valor + " convertido é: " + distancia.metrosParaQuilometro(valor) + "Km");
            } else if (escolha == 2) {
                LOGGER.info("Qual o valor deseja converter Km para m?");
                valor = sc.nextDouble();
                LOGGER.info(valor + " convertido é: " + distancia.quilometroParaMetros(valor) + "m");
            } else {
                LOGGER.error("Opção inválida para o numero: " + escolha);
            }
        } else {
            LOGGER.error("Opção inválida: " + escolha);
        }

        LOGGER.debug("Encerrando o programa de conversão.");
    }
}
