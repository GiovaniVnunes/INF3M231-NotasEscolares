package appjava4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("informe o código da fruta: \n");
        int fruta = entrada.nextInt();
       

        if (fruta >= 10 && fruta <= 100) {
            switch (fruta) {
                case 10:
                    System.out.println("Laranja");

                    break;
                case 20:
                    System.out.println("Maçã");
                    break;
                case 30:
                    System.out.println("Banana");
                    break;
                case 40:
                    System.out.println("Uva");
                    break;
                case 50:
                    System.out.println("Ameixa");

                default:
                    System.out.println("O código está incorreto");
                    break;
            }
        } 
        entrada.close();
    }
}
