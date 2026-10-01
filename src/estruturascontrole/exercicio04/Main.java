package estruturascontrole.exercicio04;
import java.util.Scanner;

/* Enunciado: Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N
números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto
diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados */

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var initialNumber = scanner.nextInt();
        var number = 0;

        do {
            System.out.println("Informe outro numero:");
            number = scanner.nextInt();
            if (number < initialNumber) {
                continue;
            }
        } while (number % initialNumber == 0);

        System.out.println("Fim da execução");
    }
}

