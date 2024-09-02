package appjava3;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        double nota = 0.0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("informe a nota\n");
        nota = entrada.nextDouble();
        double media = 7.0;

        if (nota >= 0 && nota <= 10) {
            if (nota >= 9.1) {
                System.out.print("Conceito A\n");
                System.out.print("Hall da Fama\n");
            } else if (nota >= media) {
                System.out.print("Aprovado");
            } else if (nota >= 3 && nota < media) {
                System.out.print("Recuperação");
            } else if (nota < 3) {
                System.out.print("Reprovado");
            }
        }
        entrada.close();
    }
}
