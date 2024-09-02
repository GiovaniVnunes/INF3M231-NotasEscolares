package appjava1.appjava10;

import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {

        float peso, altura, imc;
        String resultado = "";
        Scanner ler = new Scanner(System.in);

        System.out.print("Calculadora de IMC\n");

        System.out.print("Informe a altura: ");
        altura = ler.nextFloat();

        System.out.println("Informe o peso: ");
        peso = ler.nextFloat();

        imc = (float) (peso / Math.pow(altura, 2));
        ler.close();
        /*
         * resultados menores que 16 — magreza grave;
         * resultados entre 16 e 16,9 — magreza moderada;
         * resultados entre 17 e 18,5 — magreza leve;
         * resultados entre 18,6 e 24,9 — peso ideal;
         * resultados entre 25 e 29,9 — sobrepeso;
         * resultados entre 30 e 34,9 — obesidade grau I;
         */
        if (imc < 16) {
            resultado = "Magreza grave";
        } else if (imc < 16.9) {
            resultado = "Magreza moderada";

        } else if (imc < 18.5) {
            resultado = "Magreza leve";
        } else if (imc < 24.9) {
            resultado = "Peso ideal";
        } else if (imc < 29.9) {    
            resultado = "Sobrepeso";
        } else if (imc < 34.9) {
            resultado = "Obesidade grau I";
        } else if (imc < 39.9) {
            resultado = "Obesidade grau II";
        } else {
            resultado = "Obesidade grau III";
        }
        System.out.print("Seu IMC é: " + imc + " e o resultado é: " + resultado);
    }
}