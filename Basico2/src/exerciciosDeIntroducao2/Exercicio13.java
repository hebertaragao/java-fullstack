package exerciciosDeIntroducao2;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o  ano: ");
        int ano = scan.nextInt();

        if(ano % 4 == 0){
            if (ano % 100 == 0 && ano % 400 != 0) {
                System.out.println("O ano " + ano + " não é bissexto.");
            } else {
                System.out.println("O ano " + ano + " é bissexto.");
            }
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }


        scan.close();

    }

}
