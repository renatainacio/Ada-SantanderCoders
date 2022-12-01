import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean looping;
        Integer idade;

        System.out.println("Insira a idade:");
        idade = 0;
        do {
            try{
                looping = false;
                idade = Integer.parseInt(input.next());
            } catch (NumberFormatException e){
                looping = true;
                System.out.println("Formato de idade inválido, insira novamente:");}
        } while (looping == true);
        System.out.println(CheckIdade(idade));
    }

    private static String CheckIdade(Integer idade){
        if (idade >= 18 && idade <= 70)
            return("Voto obrigatório");
        else if (idade >= 16 || idade > 70)
            return("Voto facultativo");
        else
            return("Sem direito a votar");
    }
}