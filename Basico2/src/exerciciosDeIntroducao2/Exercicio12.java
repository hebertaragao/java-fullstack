package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7: ");
        int numero = scan.nextInt();

        if(numero == 1){
            System.out.println("Domingo");
        } else if(numero == 2){
            System.out.println("Segunda-feira");
        } else if(numero == 3){
            System.out.println("Terça-feira");
        } else if(numero == 4){
            System.out.println("Quarta-feira");
        } else if(numero == 5){
            System.out.println("Quinta-feira");
        } else if(numero == 6){
            System.out.println("Sexta-feira");
        } else if(numero == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Número inválido! Por favor, digite um número entre 1 e 7.");
        }

        scan.close();
    }
}
