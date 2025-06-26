package exerciciodecondicional;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de unidades de medida!");
        System.out.println("Por favor, selecione a unidade de entrada:");
        System.out.println("1. Metro (m)");
        System.out.println("2. Centímetro (cm)");
        System.out.println("3. Quilômetro (km)");

        int escolhaEntrada = scan.nextInt();

        System.out.println("Por favor, selecione a unidade de saída:");
        System.out.println("1. Metro (m)");
        System.out.println("2. Centímetro (cm)");
        System.out.println("3. Quilômetro (km)");

        int escolhaSaida = scan.nextInt();

        // Verifica se a escolha é válida antes de pedir o valor
        if (escolhaEntrada < 1 || escolhaEntrada > 3 || escolhaSaida < 1 || escolhaSaida > 3) {
            System.out.println("Opção inválida. Encerrando o programa.");
            scan.close();
            return;
        }

        System.out.println("Por favor, insira o valor a ser convertido:");
        double valorEntrada = scan.nextDouble();

        double resultado = 0.0;

        // Conversão
        if (escolhaEntrada == 1) { // Metro
            if (escolhaSaida == 1) resultado = valorEntrada;
            else if (escolhaSaida == 2) resultado = valorEntrada * 100;
            else if (escolhaSaida == 3) resultado = valorEntrada / 1000;
        } else if (escolhaEntrada == 2) { // Centímetro
            if (escolhaSaida == 1) resultado = valorEntrada / 100;
            else if (escolhaSaida == 2) resultado = valorEntrada;
            else if (escolhaSaida == 3) resultado = valorEntrada / 100000;
        } else if (escolhaEntrada == 3) { // Quilômetro
            if (escolhaSaida == 1) resultado = valorEntrada * 1000;
            else if (escolhaSaida == 2) resultado = valorEntrada * 100000;
            else if (escolhaSaida == 3) resultado = valorEntrada;
        }

        System.out.println("O resultado da conversão é: " + resultado);
        scan.close();
    }
}
