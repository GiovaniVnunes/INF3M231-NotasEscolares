package appjava7;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("volta n° " + i);
        }
        System.out.println("Fim do programa!");
    }
}
