import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] entradaDados = EntradaDeDados();

        MediaTotalArray(entradaDados);
        QuantosRepete(entradaDados, SelecaoUsuario());
    }

    static int[] EntradaDeDados() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira números inteiros. Pressione Enter vazio para finalizar.");

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.trim().isEmpty()) {
                break; // Finaliza se o usuário pressionar Enter vazio
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Insira apenas números inteiros.");
            }
        }

        // Converter a lista em um array de inteiros
        int[] arrayNumeros = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            arrayNumeros[i] = numeros.get(i);
        }

        return arrayNumeros;
    }

    static void MediaTotalArray(int[] entrada) {
        if (entrada == null || entrada.length == 0) {
            System.out.println("O array está vazio. Não é possível calcular a média.");
            return;
        }

        int soma = 0;
        for (int value : entrada) {
            soma += value;
        }

        System.out.println("A média dos valores do array é: " + (double) soma / entrada.length + " !");
        System.out.println("O tamanho do array é: " + entrada.length + " !");
    }

    static void QuantosRepete(int[] numeros, int entrada) {
        if (numeros == null || numeros.length == 0) {
            System.out.println("O array está vazio. Não há números para verificar.");
            return;
        }

        int contador = 0;
        for (int value : numeros) {
            if (value == entrada) {
                contador++;
            }
        }

        System.out.println("O número " + entrada + " repete " + contador + " vezes!");
    }

    static int SelecaoUsuario() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Digite o número que deseja verificar: ");
            String entrada = scanner.nextLine();

            try {
                numero = Integer.parseInt(entrada);
                return numero; // Retorna o número sem fechar o Scanner
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número!");
            }
        }
    }
}
