package exerciciodecondicional;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota musical (A, B, C, D, E, F): ");
        String nota = scan.nextLine().toUpperCase();

        double frequencia = 0.0;

        switch (nota) {
            case "A":
                frequencia = 440.0; // Frequência da nota A
                System.out.println("A frequência da nota A é: " + frequencia + " Hz");
                break;
            case "B":
                frequencia = 493.88; // Frequência da nota B        
                System.out.println("A frequência da nota B é: " + frequencia + " Hz");
                break;
            case "C":   
                frequencia = 523.25; // Frequência da nota C
                System.out.println("A frequência da nota C é: " + frequencia + " Hz");
                break;
            case "D":
                frequencia = 587.33; // Frequência da nota D        
                System.out.println("A frequência da nota D é: " + frequencia + " Hz");
                break;
            case "E":
                frequencia = 659.25; // Frequência da nota E        
                System.out.println("A frequência da nota E é: " + frequencia + " Hz");
                break;
            case "F":
                frequencia = 698.46; // Frequência da nota F
                System.out.println("A frequência da nota F é: " + frequencia + " Hz");
                break;
        
            default:
                break;
        }

        if (frequencia != 0.0) {
            System.out.println("A nota " + nota + " tem uma frequência de " + frequencia + " Hz.");
        } else {
            System.out.println("A nota " + nota + " não é uma nota musical válida.");
        }



        scan.close();
    }

}
