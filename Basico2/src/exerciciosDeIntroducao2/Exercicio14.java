package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a hora atual (formato 24 horas): ");
        int hora = scan.nextInt();

        if (hora >= 0 && hora < 24) {
            String saudacao;
            if (hora >= 0 && hora < 12) {
                saudacao = "Bom dia!";
            } else if (hora >= 12 && hora < 18) {
                saudacao = "Boa tarde!";
            } else {
                saudacao = "Boa noite!";
            }
            System.out.println(saudacao);
        }
        else {
            System.out.println("Hora inválida. Por favor, insira um valor entre 0 e 23.");
        }
         

        scan.close();
    }

}
