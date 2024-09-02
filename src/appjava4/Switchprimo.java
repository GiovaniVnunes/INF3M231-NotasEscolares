package appjava4;

import java.util.Scanner;

public class Switchprimo {
    public static void main(String[] args) {
        int contDiv = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um n° inteiro: ");

        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contDiv++;
            }
        }
        switch (contDiv) {
            case 2:
                System.out.print("É primo!");
                break;
            default:
                System.out.print("Não é primo!");
                break;
        }
        entrada.close();
    }
}
