import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, numeroEntrada, numeroLimite;

        System.out.println("Por favor, informe um número para descobrirmos a tabuada dele!");
        numeroEntrada = scanner.nextInt();
        
        System.out.println("Indique o tamanho do alcance da  tabuada.");
        numeroLimite = scanner.nextInt();

        for (i = 0; i <= numeroLimite; i++) {
            int resultado = numeroEntrada * i;
            System.out.println(String.format("A multiplicação de %d * %d = %d", numeroEntrada, i, resultado));
        }
        System.out.println("Fim.");

        scanner.close();
    }
}
