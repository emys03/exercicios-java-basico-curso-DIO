package estruturascontrole.exercicio02;
import java.util.Scanner;

/* Enunciado: Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu
IMC (IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)"; */

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Qual a sua altura?");
        var altura = scanner.nextDouble();
        System.out.println("Qual o seu peso?");
        var peso = scanner.nextDouble();
        double calculoImc = peso / (altura * altura);

        if (calculoImc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (calculoImc >= 18.6 && calculoImc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (calculoImc >= 25.0 && calculoImc <= 29.9) {
            System.out.println("Levemente acima do seu peso");
        } else if (calculoImc >= 30.0 && calculoImc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (calculoImc >= 35.0 && calculoImc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else if (calculoImc >= 40.0) {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
    }
}

