package appjava8;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0, maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe os valores");
            valor = entrada.nextInt();
            if (maior <= valor) {
                maior = valor;
            }
        }
        System.out.println("O maior valor é: " + maior);
        entrada.close();
    }
}
