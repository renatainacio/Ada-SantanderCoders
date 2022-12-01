import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean looping;
        Integer idade;

        idade = 0;
        System.out.println("Insira a idade:");
        do {
            try{
                looping = false;
                idade = Integer.parseInt(input.next());
            } catch (NumberFormatException e){
                looping = true;
                System.out.println("Formato de idade inválido, insira novamente:");}
        } while (looping == true);
        System.out.println(checkIdade(idade));
    }
    private static String checkIdade (Integer idade) {
        return ((idade >= 18 && idade <= 70) ?  "Voto obrigatório" :
                ((idade >= 16 || idade > 70) ? "Voto facultativo" : "Sem direito a votar"))
    }
}