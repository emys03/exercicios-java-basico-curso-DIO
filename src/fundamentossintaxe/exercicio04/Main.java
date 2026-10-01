package fundamentossintaxe.exercicio04;
import java.util.Scanner;

// Enunciado: Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

public class Main {
    public static void main(String args[]) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        var name1 = scanner.next();
        System.out.println("Qual a sua idade?");
        var age1 = scanner.nextInt();
        System.out.println("Qual o seu nome?");
        var name2 = scanner.next();
        System.out.println("Qual a sua idade?");
        var age2 = scanner.nextInt();

        var ageDifference = Math.abs(age1 - age2);

        System.out.printf("A diferença de idade entre %s e %s é de %s anos\n", name1, name2, ageDifference);

        scanner.close();
    }
}

