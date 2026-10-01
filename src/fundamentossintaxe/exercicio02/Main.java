package fundamentossintaxe.exercicio02;
import java.util.Scanner;

/* Enunciado: Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
Fórmula: área = lado X lado */

public class Main {
    public static void main(String args[]) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado?");
        var tamanhoLado = scanner.nextInt();
        System.out.printf("A área do quadrado é %s", Math.pow(tamanhoLado, 2));
    }
}

