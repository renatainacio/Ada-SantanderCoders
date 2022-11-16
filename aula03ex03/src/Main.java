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
        switch (numeroBebida)
        {
            case 1:
                System.out.println("Coca-Cola - R$ 5");
                break;
            case 2:
                System.out.println("Coca-Cola 0 - R$ 4.50");
                break;
            case 3:
                System.out.println("Pepsi - R$ 4,40");
                break;
            case 4:
                System.out.println("Guaraná Antarctica - R$ 3,50");
                break;
            case 5:
                System.out.println("Fanta Laranja - R$ 4,23");
                break;
            case 6:
                System.out.println("Água - R$ 2,50");
                break;
            default:
                System.out.println("Input inválido.");
        }
    }
}