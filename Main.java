import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe-me a hora: ");
        Double hora = scanner.nextDouble();

        while(!(hora <= 23 && hora >= 0)){ 
            System.out.println("Informe o horário, válido entre 00 e 23h");
            hora = scanner.nextDouble();
        }

        if(hora >= 6 && hora <= 12){
            System.out.println("Desejamos a si, um bom dia!");
        }else if(hora >= 13 && hora <= 18){
            System.out.println("Desejamos a si, uma boa tarde!");
        }else{
            System.out.println("Desejamos a si, uma boa noite!");
        }
        scanner.close();
    }
}
