package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperaturaCelsius;
        int escolha;

        System.out.println("Digite a temperatura em Celsius: ");
        temperaturaCelsius = scan.nextDouble();

        System.out.println("Deseja converter para Fahrenheit (1) ou Kelvin (2)? ");
        escolha = scan.nextInt();

        if (escolha == 1) {
            double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", temperaturaFahrenheit);
        } else if (escolha == 2) {
            double temperaturaKelvin = temperaturaCelsius + 273.15;
            System.out.printf("Temperatura em Kelvin: %.2fK%n", temperaturaKelvin);
        } else {
            System.out.println("Escolha inválida.");
        }
        scan.close();

    }
}
