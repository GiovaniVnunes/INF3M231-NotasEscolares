package appjava9;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int somaNumero = 0, numero = 0;

        while (numero >= 0) {
            System.out.println("Informe um númro:");
            numero = entrada.nextInt();

            if (numero >= 0) {
                somaNumero += numero;
            }
        }
        System.out.println("A soma de todos os números é: " + somaNumero);
        entrada.close();
    }
}
