import java.util.Scanner;

public class MenuBebidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU DE BEBIDAS =====");
            System.out.println("1 - Água");
            System.out.println("2 - Cerveja");
            System.out.println("3 - Vinho");
            System.out.println("4 - Frisante");
            System.out.println("5 - Sangria");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Água.");
                    break;
                case 2:
                    System.out.println("Você escolheu Cerveja.");
                    break;
                case 3:
                    System.out.println("Você escolheu Vinho.");
                    break;
                case 4:
                    System.out.println("Você escolheu Frisante.");
                    break;
                case 5:
                    System.out.println("Você escolheu Sangria.");
                    break;
                case 0:
                    System.out.println("Saindo do menu. Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
