import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe-me o mês em questão, para sabermos quantos dias ele possui!");
        int mes = scanner.nextInt();
        String mesTrintaUm = "O mês possui 31 dias!";
        String mesTrinta = "O mês possui 30 dias";
        
        switch (mes) {
            case 1:
                System.out.println("Janeiro, selecionado."); 
                System.out.println(mesTrintaUm);
                break;
            case 2:
            System.out.println("Fevereiro, selecionado. O ano é bissexto"); 
            System.out.println("Digite o número 1, se a resposta for SIM!"); 
            var entradaBissexto = scanner.nextInt();
            switch (entradaBissexto) {
                        case 1:
                            System.out.println("O mês possui 29 dias!");
                        break;
                        default:
                            System.out.println("O mês possui 28 dias!");
                        break;
                    }
                    break;
            case 3:
                System.out.println("Março, selecionado.");  
                System.out.println(mesTrintaUm);
                break;
            case 4:
                System.out.println("Abril, selecionado.");  
                System.out.println(mesTrinta);
                break;
            case 5: 
                System.out.println("Maio, selecionado."); 
                System.out.println(mesTrintaUm);
                break;
            case 6: 
            System.out.println("Junho, selecionado."); 
                System.out.println(mesTrinta);
                break;
            case 7: 
            System.out.println("Julho, selecionado."); 
                System.out.println(mesTrintaUm);
                break;
            case 8: 
            System.out.println("Agosto, selecionado."); 
                System.out.println(mesTrintaUm);
                break;
            case 9:
            System.out.println("Setembro, selecionado.");  
                System.out.println(mesTrinta);
                break;
            case 10: 
            System.out.println("Outubro, selecionado."); 
                System.out.println(mesTrintaUm);
                break;
            case 11: 
            System.out.println("Novembro, selecionado."); 
                System.out.println(mesTrinta);
                break;
            case 12: 
            System.out.println("Dezembro, selecionado."); 
                System.out.println(mesTrintaUm);
                break;
            
            default:
                System.out.println("Inserir números entre 1 e 12");
            break;
        }
        scanner.close();
    }
}
