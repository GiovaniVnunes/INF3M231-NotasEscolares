package appjava9;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano = 0;

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Informe o ano: ");
        } else {
            System.out.println("não é um ano bissexto!");
        }

    }
}
