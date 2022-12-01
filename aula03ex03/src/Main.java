import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer numeroBebida;
        numeroBebida = 0;
        boolean looping;

        System.out.println("Digite o número da bebida desejada:");
        do {
            try {
                looping = false;
                numeroBebida = Integer.parseInt(input.next());
            } catch (NumberFormatException e) {
                looping = true;
                System.out.println("Valor recebido não é valido, tente novamente:");}
        } while (looping == true);
        System.out.println(checkBebida(numeroBebida));
    }

    private static String checkBebida (int numeroBebida){
        switch (numeroBebida)
        {
            case 1:
                return ("Coca-Cola - R$ 5");
            case 2:
                return ("Coca-Cola 0 - R$ 4.50");
            case 3:
                return ("Pepsi - R$ 4,40");
            case 4:
                return ("Guaraná Antarctica - R$ 3,50");
            case 5:
                return ("Fanta Laranja - R$ 4,23");
            case 6:
                return ("Água - R$ 2,50");
            default:
                return ("Input inválido.");
        }
    }
}