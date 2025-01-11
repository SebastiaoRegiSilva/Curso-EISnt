import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Mesmos números para as duas operações.
        int[] numerosAleatorios = GerarAleatorios();

        Multiplicacao(numerosAleatorios);
        Soma(numerosAleatorios);
    }

    static int[] GerarAleatorios() {
        int[] numerosGerados = new int[3];
        Random generator = new Random();
        System.out.println("Números gerados:");

        for (int i = 0; i < numerosGerados.length; i++) {
            int aleatorio = generator.nextInt(50) + 1;
            numerosGerados[i] = aleatorio;
            System.out.println(i + ":" + aleatorio);
        }

        return numerosGerados;
    }

    static void Multiplicacao(int[] entrada) {
        int valorCompostoMultiplo = 1;
        
        for (int i = 0; i < entrada.length; i++) {
            int aleatorio = entrada[i];
            valorCompostoMultiplo *= aleatorio;
        }
        System.out.println("Resultado da multiplicação dos aleatórios é: " + valorCompostoMultiplo + "!\n");
    }

    static void Soma(int[] entrada) {
        int valorCompostoSoma = 0;
        
        for (int i = 0; i < entrada.length; i++) {
            int aleatorio = entrada[i];
            valorCompostoSoma += aleatorio;
        }
        System.out.println("Resultado da soma dos aleatórios é: " + valorCompostoSoma + "!");
        System.out.println("FIM.");
    }
}