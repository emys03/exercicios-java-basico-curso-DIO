package fundamentossintaxe.exercicio01;
import java.util.Scanner;
import java.time.OffsetDateTime;

/* Enunciado: Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte
mensagem: "Olá 'Fulano' você tem 'X' anos" */

public class Main {
    public static void main(String args[]) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe seu ano de nascimento");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá %s você tem %s anos", name, age);
        scanner.close();
    }
}

