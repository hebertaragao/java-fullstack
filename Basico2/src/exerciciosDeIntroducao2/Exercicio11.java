package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double peso, altura, imc;
        System.out.println("Digite seu peso (em kg): ");
        peso = scan.nextDouble();
        System.out.println("Digite sua altura (em metros): ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }


        scan.close();
    }

}
