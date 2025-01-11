import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Multiplicacao();
        Soma();
    }

    /**
     * Gerar valores aleatórios para operações na aplicação.
     * 
     * @return
     *         Valores inteiros entre 1 e 50.
     */
    static int GerarAleatorio() {
        Random generator = new Random();

        return generator.nextInt(50) +1;
    }

    /**
     * Impressão da resutado da multiplicação dos aletatórios.
     */
    static void Multiplicacao(){
        
        int valorCompostoMultiplo = 1;
        System.out.println("Números gerados:");
        for (int i = 1; i <= 3; i++) {
            int aleatorio = GerarAleatorio();
            valorCompostoMultiplo *= aleatorio;
            System.out.println(i + ":" + aleatorio);
        }
        System.out.println("Fim.");

        System.out.println("Resultado da multiplicação dos aleatórios é: " + valorCompostoMultiplo + "!\n");
    }

    /**
     * Impressão da resutado da soma dos aletatórios.
     */
    static void Soma(){
        int valorCompostoSoma = 0;
        System.out.println("Números gerados:");
        for (int i = 1; i <= 3; i++) {
            int aleatorio = GerarAleatorio();
            valorCompostoSoma += aleatorio;
            System.out.println(i + ":" + aleatorio);
        }
        System.out.println("FIM.");

        System.out.println("Resultado da soma dos aleatórios é: " + valorCompostoSoma + "!");
    }
}
