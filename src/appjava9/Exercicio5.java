package appjava9;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String alunos[][] = new String[5][2];
        float notas[][] = new float[5][6];

        System.out.print("Notas escolares 2 :. ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i + 1) + "º aluno: ");
            alunos[i][0] = ler.next();

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a " + (j + 1) + "º nota: ");

                notas[i][j] = ler.nextFloat();
                notas[i][5] += notas[i][j]; /* ACUMULA 4 NOTAS */
            } /* FI, DO FOR NOTAS */
            notas[i][5] = notas[i][5] / 4;/* CALCULA A MÉDIA DAS NOTAS */
            System.out.print("Digite a frequência do aluno " + alunos[i][0] + ": ");
            notas[i][4] = ler.nextFloat();
            if (notas[i][4] < 75) {
                alunos[i][1] = "Rep. por falta";
            } else if (notas[i][5] < 7) {
                alunos[i][1] = "Reprovado por nota";
            } else {
                alunos[i][1] = "Aprovado";
            }
            System.out.println("-----");
        } /* FIM DO FOR */
        for (int i = 0; i < 5; i++) {
            System.out.println("O aluno(a) : " + alunos[i][0] +
                    ":\nMédia: " + notas[i][5] +
                    "\nFreq: " + notas[i][4] +
                    "\nEesultado final: " + alunos[i][1] + ".\n------");
        }
        System.out.println(".: SISTEMA DE NOTAS ECERRADO :.");
        System.out.println("Alterado no VS online");
        ler.close();
    }
}
