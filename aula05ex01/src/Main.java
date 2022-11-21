import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaCompras = new ArrayList<>();
        String nome;
        int quantidade;
        Double preco;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Por favor digite o nome do produto ou X caso deseje encerrar a lista:");
            nome = input.next();
            if (nome.equals("X"))
                break;
            System.out.println("Por favor digite a quantidade do produto " + nome + ":");
            try{
                quantidade = input.nextInt();}
            catch (InputMismatchException e){
                System.out.println("A quantidade digitada deve ser um número inteiro.");
                return ;
            };
            try{ System.out.println("Por favor digite o preço do produto em reais" + nome + ":");
            preco = input.nextDouble(); }
            catch (InputMismatchException e) {
                System.out.println("Preço em formato inválido.");
                return ;
            }
            listaCompras.add(new Produto(nome, quantidade, preco));
        }
        System.out.println("Lista de Compras:");
        for(Produto produto: listaCompras) System.out.printf("%d x %s (R$ %.2f) = R$%.2f\n",
                produto.quantidade, produto.nomeProduto, produto.preco, produto.valorTotal);
        double soma = 0;
        for(Produto produto: listaCompras) soma += produto.valorTotal;
        System.out.printf("Valor total da compra: %.2f\n", soma);
    }

}