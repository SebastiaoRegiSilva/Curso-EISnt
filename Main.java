import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insere o teu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insere o teu apelido: ");
        String apelido = scanner.nextLine();

        System.out.println("Olá, " + nome + " " + apelido + ". Seja bem-vindo!");

        System.out.print("Insere um número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Insere novamente outro número: ");
        int segundoNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;

        System.out.println(String.format("Resultado da soma %d + %d = %d", primeiroNumero, segundoNumero, soma));
        System.out.println(String.format("Resultado da multiplicação %d * %d = %d", primeiroNumero, segundoNumero, multiplicacao));

        scanner.close();
    }
}
