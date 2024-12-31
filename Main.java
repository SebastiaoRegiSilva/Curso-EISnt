import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraPasse = "Bingo", entrada;
        int qtdTentativas = 0;

        System.out.println("Por favor, digite a palavra-passe correta!");
        
        do {
            System.out.println("Digite a palavra-passe corretamente!");
            entrada = scanner.nextLine();
            qtdTentativas++;
        } while (!entrada.equals(palavraPasse));
        
        System.out.println(MessageFormat.format("Antes de inserir a palavra-passe corretamente o usuário tentou por {0} vezes.", (qtdTentativas -1)));
        System.out.println("Fim.");
        
        scanner.close();
    }
}
