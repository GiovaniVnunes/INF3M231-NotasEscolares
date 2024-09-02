package appjava7;

public class Continue {
public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        if (i % 2 != 0) 
        continue; 
        System.out.println("Volta n°:" + i);
        }
        System.out.println("Fim do programa!");
    }
}

