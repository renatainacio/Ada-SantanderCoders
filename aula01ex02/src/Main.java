import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = input.nextInt();
        double numeroDaSorte = (double)idade + .023;
        System.out.println(numeroDaSorte);
    }
}