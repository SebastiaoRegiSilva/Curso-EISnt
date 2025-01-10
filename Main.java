import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] tabuleiro = new int[5][5];
        int totalNumeros = tabuleiro.length * tabuleiro[0].length, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, linhaMaior = -1, colunaMaior = -1, linhaMenor = -1, colunaMenor = -1;

        System.out.println("Por favor, siga as próximas instruções para preenchimento do tabuleiro de números.");
        System.out.println("Você precisa inserir " + totalNumeros + " números.");

        // Criação do tabuleiro.
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.println("Faltam " + (totalNumeros--) + " números para preencher o tabuleiro.");
                System.out.print("Insira um valor para a posição [" + i + "][" + j + "]: ");
                tabuleiro[i][j] = scanner.nextInt();
                
                if(tabuleiro[i][j] > maior){
                    maior = tabuleiro[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }else{
                    menor = tabuleiro[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        System.out.println(String.format("O maior valor é: %d e está linha: %d e coluna: %d", maior, linhaMaior, colunaMaior));
        System.out.println(String.format("O menor valor é: %d e está linha: %d e coluna: %d", menor, linhaMenor, colunaMenor));
        
        scanner.close();
    }
}
