import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean looping;
        Integer idade;

        idade = 0;
        do {
            try{
                looping = false;
                idade = Integer.parseInt(input.next());
            } catch (NumberFormatException e){
                looping = true;
                System.out.println("Formato de idade inválido, insira novamente.");}
        } while (looping == true);
        if (idade >= 18 && idade <= 70)
            System.out.println("Voto obrigatório");
        else if (idade >= 16 || idade > 70)
            System.out.println("Voto facultativo");
        else
            System.out.println("Sem direito a votar");
    }
}