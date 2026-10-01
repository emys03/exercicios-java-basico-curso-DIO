package estruturascontrole.exercicio03;
import java.util.Scanner;

/* Enunciado: Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro
e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo
com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente; */

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var number1 = scanner.nextInt();
        System.out.println("Informe outro número maior que o primeiro: ");
        var number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println("Número inválido!");
            return;
        }


        System.out.println("Você prefere par ou ímpar? (Digite 1 para par ou 2 para ímpar)");

        var option = scanner.nextInt();
        switch (option){
            case 1:
                for (var i = number2; i >= number1; i--){
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                for (var i = number2; i >= number1; i--){
                    if (i % 2 != 0){
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();

    }
}

