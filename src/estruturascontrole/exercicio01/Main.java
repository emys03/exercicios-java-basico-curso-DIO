package estruturascontrole.exercicio01;
import java.util.Scanner;

// Enunciado: Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número.

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Escolha um número");
        var numero = scanner.nextInt();
        for (var i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}

