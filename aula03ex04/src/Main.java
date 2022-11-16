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
        if (numeroBebida == 1)
            System.out.println("Coca-Cola - R$ 5");
        else if (numeroBebida == 2)
            System.out.println("Coca-Cola 0 - R$ 4.50");
        else if (numeroBebida == 3)
            System.out.println("Pepsi - R$ 4,40");
        else if (numeroBebida == 4)
            System.out.println("Guaraná Antarctica - R$ 3,50");
        else if (numeroBebida == 5)
            System.out.println("Fanta Laranja - R$ 4,23");
        else if (numeroBebida == 6)
            System.out.println("Água - R$ 2,50");
        else
            System.out.println("Input inválido.");
        }
}