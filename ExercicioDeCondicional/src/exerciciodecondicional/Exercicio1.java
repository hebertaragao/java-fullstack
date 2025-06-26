package exerciciodecondicional;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a cor do semáforo: ");
        String corDoSemaforo = scan.nextLine().toLowerCase();

        switch (corDoSemaforo) {
            case "verde":
            System.out.println("Siga em frente!");  
                
                break;
            case "amarelo":
            System.out.println("Atenção! Prepare-se para parar.");
                
                break;      
            case "vermelho":
            System.out.println("Pare! O semáforo está vermelho.");
            
                break;
        
            default:
            System.out.println("Cor inválida! Por favor, digite 'verde', 'amarelo' ou 'vermelho'.");
                break;
        }

        scan.close();

    }

}
