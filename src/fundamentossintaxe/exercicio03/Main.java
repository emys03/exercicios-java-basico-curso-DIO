package fundamentossintaxe.exercicio03;
import java.util.Scanner;

/* Enunciado: Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela.
Fórmula: área = base X altura */

public class Main {
    public static void main(String args[]) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o valor da base do retângulo?");
        var base = scanner.nextDouble();
        System.out.println("Qual o valor da altura do retângulo?");
        var altura = scanner.nextDouble();
        System.out.printf("A área do retângulo é %s * %s = %s\n", base, altura, base * altura);

        scanner.close();
    }
}

