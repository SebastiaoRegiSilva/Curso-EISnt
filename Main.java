import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Multiplicacao();
        Soma();
    }

    static int[] GerarAleatorio() {
        int[] numerosGerados = new int[3];
        Random generator = new Random();

        for (int i = 0; i < numerosGerados.length; i++) {
            numerosGerados[i] = generator.nextInt(50) + 1;
        }

        return numerosGerados;
    }

    static void Multiplicacao() {

        int valorCompostoMultiplo = 1;
        System.out.println("Números gerados:");

        for (int i = 0; i < GerarAleatorio().length; i++) {
            int aleatorio = GerarAleatorio()[i];
            valorCompostoMultiplo *= aleatorio;
            System.out.println(i + ":" + aleatorio);
        }
        System.out.println("Fim.");

        System.out.println("Resultado da multiplicação dos aleatórios é: " + valorCompostoMultiplo + "!\n");
    }

    static void Soma() {
        int valorCompostoSoma = 0;
        System.out.println("Números gerados:");
        for (int i = 0; i < GerarAleatorio().length; i++) {
            int aleatorio = GerarAleatorio()[i];
            valorCompostoSoma += aleatorio;
            System.out.println(i + ":" + aleatorio);
        }
        System.out.println("FIM.");

        System.out.println("Resultado da soma dos aleatórios é: " + valorCompostoSoma + "!");
    }
}